USE [DoAnCSDLNC]
GO
/****** Object:  Table [dbo].[DONVIVATTU]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DONVIVATTU](
	[Id] [bigint] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](40) NOT NULL,
	[Ordering] [int] NULL,
	[IsDeleted] [bit] NOT NULL,
	[CreatorUserId] [bigint] NULL,
	[CreationTime] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  View [dbo].[v_DONVIVATTU]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

/*VIEW*/
/*DONVIVATTU*/
CREATE VIEW [dbo].[v_DONVIVATTU]
AS
SELECT        *
FROM          dbo.DONVIVATTU
WHERE        (dbo.DONVIVATTU.IsDeleted = 0)
GO
/****** Object:  Table [dbo].[GIOITINH]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[GIOITINH](
	[Id] [bigint] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](40) NOT NULL,
	[Ordering] [int] NULL,
	[IsDeleted] [bit] NOT NULL,
	[CreatorUserId] [bigint] NULL,
	[CreationTime] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  View [dbo].[v_GIOITINH]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

/*GIOITINH*/
CREATE VIEW [dbo].[v_GIOITINH]
AS
SELECT        *
FROM          dbo.GIOITINH
WHERE        (dbo.GIOITINH.IsDeleted = 0)
GO
/****** Object:  Table [dbo].[KHACHHANG]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KHACHHANG](
	[Id] [bigint] IDENTITY(1,1) NOT NULL,
	[CustomerName] [nvarchar](40) NOT NULL,
	[GenderId] [bigint] NOT NULL,
	[Phone] [varchar](15) NOT NULL,
	[IsDeleted] [bit] NOT NULL,
	[CreatorUserId] [bigint] NULL,
	[CreationTime] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  View [dbo].[v_KHACHHANG]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

/*KHACHHANG*/
CREATE VIEW [dbo].[v_KHACHHANG]
AS
SELECT        *
FROM          dbo.KHACHHANG
WHERE        (dbo.KHACHHANG.IsDeleted = 0)
GO
/****** Object:  Table [dbo].[LOAIVATTU]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LOAIVATTU](
	[Id] [bigint] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](40) NOT NULL,
	[Ordering] [int] NULL,
	[IsDeleted] [bit] NOT NULL,
	[CreatorUserId] [bigint] NULL,
	[CreationTime] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  View [dbo].[v_LOAIVATTU]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

/*LOAIVATTU*/
CREATE VIEW [dbo].[v_LOAIVATTU]
AS
SELECT        *
FROM          dbo.LOAIVATTU
WHERE        (dbo.LOAIVATTU.IsDeleted = 0)
GO
/****** Object:  Table [dbo].[PHIEUNHAP]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PHIEUNHAP](
	[Id] [bigint] IDENTITY(1,1) NOT NULL,
	[Code] [nvarchar](40) NOT NULL,
	[OrderEntryDate] [datetime] NOT NULL,
	[TotalAmount] [bigint] NULL,
	[SupplierId] [bigint] NULL,
	[EmployeeId] [bigint] NOT NULL,
	[Description] [nvarchar](250) NULL,
	[IsDeleted] [bit] NOT NULL,
	[CreatorUserId] [bigint] NULL,
	[CreationTime] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  View [dbo].[v_PHIEUNHAP]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

/*PHIEUNHAP*/
CREATE VIEW [dbo].[v_PHIEUNHAP]
AS
SELECT        *
FROM          dbo.PHIEUNHAP
WHERE        (dbo.PHIEUNHAP.IsDeleted = 0)
GO
/****** Object:  Table [dbo].[PHIEUNHAPCHITIET]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PHIEUNHAPCHITIET](
	[Id] [bigint] IDENTITY(1,1) NOT NULL,
	[StockReceivedDocketId] [bigint] NOT NULL,
	[SupplyId] [bigint] NOT NULL,
	[Quantity] [int] NOT NULL,
	[SupplyAmount] [bigint] NULL,
	[LocationId] [bigint] NULL,
	[Description] [nvarchar](250) NULL,
	[IsDeleted] [bit] NOT NULL,
	[CreatorUserId] [bigint] NULL,
	[CreationTime] [datetime] NULL,
	[TotalAmount]  AS ([Quantity]*[SupplyAmount]),
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  View [dbo].[v_PHIEUNHAPCHITET]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

/*PHIEUNHAPCHITIET*/
CREATE VIEW [dbo].[v_PHIEUNHAPCHITET]
AS
SELECT        *
FROM          dbo.PHIEUNHAPCHITIET 
WHERE        (dbo.PHIEUNHAPCHITIET.IsDeleted = 0)
GO
/****** Object:  Table [dbo].[NHACUNGCAP]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NHACUNGCAP](
	[Id] [bigint] IDENTITY(1,1) NOT NULL,
	[Supplier] [nvarchar](50) NOT NULL,
	[Address] [nvarchar](50) NOT NULL,
	[Phone] [varchar](15) NOT NULL,
	[IsDeleted] [bit] NOT NULL,
	[CreatorUserId] [bigint] NULL,
	[CreationTime] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  View [dbo].[v_NHACUNGCAP]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

/*NHACUNGCAP*/
CREATE VIEW [dbo].[v_NHACUNGCAP]
AS
SELECT        *
FROM          dbo.NHACUNGCAP 
WHERE        (dbo.NHACUNGCAP.IsDeleted = 0)
GO
/****** Object:  Table [dbo].[NHANVIEN]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NHANVIEN](
	[Id] [bigint] IDENTITY(1,1) NOT NULL,
	[EmployeeFirstName] [nvarchar](20) NOT NULL,
	[EmployeeLastName] [nvarchar](20) NOT NULL,
	[DateOfBirth] [date] NOT NULL,
	[GenderId] [bigint] NOT NULL,
	[Phone] [varchar](15) NOT NULL,
	[UserAccount] [varchar](20) NOT NULL,
	[UserPassword] [varchar](10) NOT NULL,
	[IsDeleted] [bit] NOT NULL,
	[CreatorUserId] [bigint] NULL,
	[CreationTime] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  View [dbo].[v_NHANVIEN]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[v_NHANVIEN]
AS
SELECT        nhanvien.Id, nhanvien.EmployeeFirstName AS Ten, nhanvien.EmployeeLastName AS Ho, gioitinh.Name AS GioiTinh, nhanvien.DateOfBirth AS NgaySinh, nhanvien.Phone AS SDT, nhanvien.UserAccount AS Account, 
                         nhanvien.UserPassword AS Pass
FROM            dbo.NHANVIEN AS nhanvien INNER JOIN
                         dbo.GIOITINH AS gioitinh ON nhanvien.GenderId = gioitinh.Id
WHERE        (nhanvien.IsDeleted = 0)
GO
/****** Object:  Table [dbo].[HANGTONKHO]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HANGTONKHO](
	[Id] [bigint] IDENTITY(1,1) NOT NULL,
	[SupplyId] [bigint] NOT NULL,
	[Quantity] [int] NOT NULL,
	[QuantityRemain] [int] NOT NULL,
	[SupplierId] [bigint] NOT NULL,
	[Description] [nvarchar](250) NULL,
	[IsDeleted] [bit] NOT NULL,
	[CreatorUserId] [bigint] NULL,
	[CreationTime] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KHOHANG]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KHOHANG](
	[Id] [bigint] IDENTITY(1,1) NOT NULL,
	[Code] [nvarchar](250) NULL,
	[Name] [nvarchar](250) NULL,
	[Description] [nvarchar](250) NULL,
	[IsDeleted] [bit] NOT NULL,
	[CreatorUserId] [bigint] NULL,
	[CreationTime] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PHIEUTRAHANG]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PHIEUTRAHANG](
	[Id] [bigint] IDENTITY(1,1) NOT NULL,
	[SupplyId] [bigint] NOT NULL,
	[EmployeeId] [bigint] NOT NULL,
	[Quantity] [int] NOT NULL,
	[Description] [nvarchar](250) NULL,
	[IsDeleted] [bit] NOT NULL,
	[CreatorUserId] [bigint] NULL,
	[CreationTime] [datetime] NULL,
	[OrderPayDay] [datetime] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PHIEUXUAT]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PHIEUXUAT](
	[Id] [bigint] IDENTITY(1,1) NOT NULL,
	[Code] [nvarchar](40) NOT NULL,
	[OrderDepartureDate] [datetime] NOT NULL,
	[TotalAmount] [bigint] NULL,
	[CustomerId] [bigint] NULL,
	[EmployeeId] [bigint] NOT NULL,
	[Description] [nvarchar](250) NULL,
	[IsDeleted] [bit] NOT NULL,
	[CreatorUserId] [bigint] NULL,
	[CreationTime] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PHIEUXUATCHITIET]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PHIEUXUATCHITIET](
	[Id] [bigint] IDENTITY(1,1) NOT NULL,
	[DelieveryDocketId] [bigint] NOT NULL,
	[SupplyId] [bigint] NOT NULL,
	[Quantity] [int] NOT NULL,
	[SupplyAmount] [bigint] NULL,
	[LocationId] [bigint] NULL,
	[Description] [nvarchar](250) NULL,
	[IsDeleted] [bit] NOT NULL,
	[CreatorUserId] [bigint] NULL,
	[CreationTime] [datetime] NULL,
	[TotalAmount]  AS ([Quantity]*[SupplyAmount]),
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[VATTU]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[VATTU](
	[Id] [bigint] IDENTITY(1,1) NOT NULL,
	[SuppliesName] [nvarchar](40) NOT NULL,
	[SuppliesType] [bigint] NULL,
	[SuppliesUnit] [bigint] NULL,
	[SuppliesAmount] [int] NULL,
	[IsDeleted] [bit] NOT NULL,
	[CreatorUserId] [bigint] NULL,
	[CreationTime] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[VITRIKHOHANG]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[VITRIKHOHANG](
	[Id] [bigint] IDENTITY(1,1) NOT NULL,
	[WarehouseId] [bigint] NOT NULL,
	[Code] [nvarchar](250) NULL,
	[Name] [nvarchar](250) NULL,
	[Description] [nvarchar](250) NULL,
	[IsDeleted] [bit] NOT NULL,
	[CreatorUserId] [bigint] NULL,
	[CreationTime] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[DONVIVATTU] ADD  DEFAULT ((0)) FOR [IsDeleted]
GO
ALTER TABLE [dbo].[DONVIVATTU] ADD  DEFAULT (getdate()) FOR [CreationTime]
GO
ALTER TABLE [dbo].[GIOITINH] ADD  DEFAULT ((0)) FOR [IsDeleted]
GO
ALTER TABLE [dbo].[GIOITINH] ADD  DEFAULT (getdate()) FOR [CreationTime]
GO
ALTER TABLE [dbo].[HANGTONKHO] ADD  DEFAULT ((0)) FOR [IsDeleted]
GO
ALTER TABLE [dbo].[HANGTONKHO] ADD  DEFAULT (getdate()) FOR [CreationTime]
GO
ALTER TABLE [dbo].[KHACHHANG] ADD  DEFAULT ((0)) FOR [IsDeleted]
GO
ALTER TABLE [dbo].[KHACHHANG] ADD  DEFAULT (getdate()) FOR [CreationTime]
GO
ALTER TABLE [dbo].[KHOHANG] ADD  DEFAULT ((0)) FOR [IsDeleted]
GO
ALTER TABLE [dbo].[KHOHANG] ADD  DEFAULT (getdate()) FOR [CreationTime]
GO
ALTER TABLE [dbo].[LOAIVATTU] ADD  DEFAULT ((0)) FOR [IsDeleted]
GO
ALTER TABLE [dbo].[LOAIVATTU] ADD  DEFAULT (getdate()) FOR [CreationTime]
GO
ALTER TABLE [dbo].[NHACUNGCAP] ADD  DEFAULT ((0)) FOR [IsDeleted]
GO
ALTER TABLE [dbo].[NHACUNGCAP] ADD  DEFAULT (getdate()) FOR [CreationTime]
GO
ALTER TABLE [dbo].[NHANVIEN] ADD  DEFAULT ((0)) FOR [IsDeleted]
GO
ALTER TABLE [dbo].[NHANVIEN] ADD  DEFAULT (getdate()) FOR [CreationTime]
GO
ALTER TABLE [dbo].[PHIEUNHAP] ADD  DEFAULT ((0)) FOR [IsDeleted]
GO
ALTER TABLE [dbo].[PHIEUNHAP] ADD  DEFAULT (getdate()) FOR [CreationTime]
GO
ALTER TABLE [dbo].[PHIEUNHAPCHITIET] ADD  DEFAULT ((0)) FOR [IsDeleted]
GO
ALTER TABLE [dbo].[PHIEUNHAPCHITIET] ADD  DEFAULT (getdate()) FOR [CreationTime]
GO
ALTER TABLE [dbo].[PHIEUTRAHANG] ADD  DEFAULT ((0)) FOR [IsDeleted]
GO
ALTER TABLE [dbo].[PHIEUTRAHANG] ADD  DEFAULT (getdate()) FOR [CreationTime]
GO
ALTER TABLE [dbo].[PHIEUXUAT] ADD  DEFAULT ((0)) FOR [IsDeleted]
GO
ALTER TABLE [dbo].[PHIEUXUAT] ADD  DEFAULT (getdate()) FOR [CreationTime]
GO
ALTER TABLE [dbo].[PHIEUXUATCHITIET] ADD  DEFAULT ((0)) FOR [IsDeleted]
GO
ALTER TABLE [dbo].[PHIEUXUATCHITIET] ADD  DEFAULT (getdate()) FOR [CreationTime]
GO
ALTER TABLE [dbo].[VATTU] ADD  DEFAULT ((0)) FOR [IsDeleted]
GO
ALTER TABLE [dbo].[VATTU] ADD  DEFAULT (getdate()) FOR [CreationTime]
GO
ALTER TABLE [dbo].[VITRIKHOHANG] ADD  DEFAULT ((0)) FOR [IsDeleted]
GO
ALTER TABLE [dbo].[VITRIKHOHANG] ADD  DEFAULT (getdate()) FOR [CreationTime]
GO
ALTER TABLE [dbo].[HANGTONKHO]  WITH CHECK ADD FOREIGN KEY([SupplierId])
REFERENCES [dbo].[NHACUNGCAP] ([Id])
GO
ALTER TABLE [dbo].[HANGTONKHO]  WITH CHECK ADD FOREIGN KEY([SupplyId])
REFERENCES [dbo].[VATTU] ([Id])
GO
ALTER TABLE [dbo].[KHACHHANG]  WITH CHECK ADD FOREIGN KEY([GenderId])
REFERENCES [dbo].[GIOITINH] ([Id])
GO
ALTER TABLE [dbo].[NHANVIEN]  WITH CHECK ADD FOREIGN KEY([GenderId])
REFERENCES [dbo].[GIOITINH] ([Id])
GO
ALTER TABLE [dbo].[PHIEUNHAP]  WITH CHECK ADD FOREIGN KEY([EmployeeId])
REFERENCES [dbo].[NHANVIEN] ([Id])
GO
ALTER TABLE [dbo].[PHIEUNHAP]  WITH CHECK ADD FOREIGN KEY([SupplierId])
REFERENCES [dbo].[NHACUNGCAP] ([Id])
GO
ALTER TABLE [dbo].[PHIEUNHAPCHITIET]  WITH CHECK ADD FOREIGN KEY([LocationId])
REFERENCES [dbo].[VITRIKHOHANG] ([Id])
GO
ALTER TABLE [dbo].[PHIEUNHAPCHITIET]  WITH CHECK ADD FOREIGN KEY([StockReceivedDocketId])
REFERENCES [dbo].[PHIEUNHAP] ([Id])
GO
ALTER TABLE [dbo].[PHIEUNHAPCHITIET]  WITH CHECK ADD FOREIGN KEY([SupplyId])
REFERENCES [dbo].[VATTU] ([Id])
GO
ALTER TABLE [dbo].[PHIEUTRAHANG]  WITH CHECK ADD FOREIGN KEY([EmployeeId])
REFERENCES [dbo].[NHANVIEN] ([Id])
GO
ALTER TABLE [dbo].[PHIEUTRAHANG]  WITH CHECK ADD FOREIGN KEY([SupplyId])
REFERENCES [dbo].[HANGTONKHO] ([Id])
GO
ALTER TABLE [dbo].[PHIEUXUAT]  WITH CHECK ADD FOREIGN KEY([CustomerId])
REFERENCES [dbo].[KHACHHANG] ([Id])
GO
ALTER TABLE [dbo].[PHIEUXUAT]  WITH CHECK ADD FOREIGN KEY([EmployeeId])
REFERENCES [dbo].[NHANVIEN] ([Id])
GO
ALTER TABLE [dbo].[PHIEUXUATCHITIET]  WITH CHECK ADD FOREIGN KEY([DelieveryDocketId])
REFERENCES [dbo].[PHIEUXUAT] ([Id])
GO
ALTER TABLE [dbo].[PHIEUXUATCHITIET]  WITH CHECK ADD FOREIGN KEY([LocationId])
REFERENCES [dbo].[VITRIKHOHANG] ([Id])
GO
ALTER TABLE [dbo].[PHIEUXUATCHITIET]  WITH CHECK ADD FOREIGN KEY([SupplyId])
REFERENCES [dbo].[HANGTONKHO] ([Id])
GO
ALTER TABLE [dbo].[VATTU]  WITH CHECK ADD FOREIGN KEY([SuppliesType])
REFERENCES [dbo].[LOAIVATTU] ([Id])
GO
ALTER TABLE [dbo].[VATTU]  WITH CHECK ADD FOREIGN KEY([SuppliesUnit])
REFERENCES [dbo].[DONVIVATTU] ([Id])
GO
ALTER TABLE [dbo].[VITRIKHOHANG]  WITH CHECK ADD FOREIGN KEY([WarehouseId])
REFERENCES [dbo].[KHOHANG] ([Id])
GO
/****** Object:  StoredProcedure [dbo].[DELETE_VATTU]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		Toan
-- Create date: 6/12/2022
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[DELETE_VATTU]
	-- Add the parameters for the stored procedure here
	@Id BIGINT
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	UPDATE VATTU
	Set IsDeleted = 1
	WHERE VATTU.Id = @Id
END
GO


/****** Object:  StoredProcedure [dbo].[DONVIVATTU_INS_UPD_DEL]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[DONVIVATTU_INS_UPD_DEL]
	-- Add the parameters for the stored procedure here
	@Id BIGINT,
	@Ordering varchar(50),
	@Name nvarchar(50),
	@CreatorUSerId BIGINT,
	@CreationTime datetime,
	@StatementType NVARCHAR(20) = ''
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

   IF @StatementType = 'Insert'
        BEGIN
            INSERT INTO DONVIVATTU
                        (
                         
                         Name,
                         Ordering,
						 IsDeleted,
						 CreationTime,
						 CreatorUserId
						 )
            VALUES     (
                         
                         @Name,
						 @Ordering,
						 0,
						 getDate(),
						 1
						 )
        END

     
      IF @StatementType = 'Update'
        BEGIN
            UPDATE DONVIVATTU
            SET    
			       Ordering = @Ordering,
                   Name = @Name,
				   CreatorUserId = @CreatorUSerId,
				   CreationTime = @CreationTime
            WHERE  Id = @Id
        END
      ELSE IF @StatementType = 'Delete'
        BEGIN
            UPDATE DONVIVATTU
            SET    IsDeleted = 1
            WHERE  Id = @Id
        END
END
GO
/****** Object:  StoredProcedure [dbo].[Gioitinh_INS_UPD_DEL]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[Gioitinh_INS_UPD_DEL]
	-- Add the parameters for the stored procedure here
	@Id BIGINT,
	@Ordering varchar(50),
	@Name nvarchar(50),
	@CreatorUSerId BIGINT,
	@CreationTime datetime,
	@StatementType NVARCHAR(20) = ''
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

   IF @StatementType = 'Insert'
        BEGIN
            INSERT INTO GIOITINH
                        (
                         
                         Name,
                         Ordering,
						 IsDeleted,
						 CreationTime,
						 CreatorUserId
						 )
            VALUES     (
                        
                         @Name,
						 @Ordering,
						 0,
						 getDate(),
						 1
						 )
        END

     
      IF @StatementType = 'Update'
        BEGIN
            UPDATE GIOITINH
            SET    
			       Ordering = @Ordering,
                   Name = @Name,
				   CreatorUserId = @CreatorUSerId,
				   CreationTime = @CreationTime
            WHERE  Id = @Id
        END
      ELSE IF @StatementType = 'Delete'
        BEGIN
            UPDATE DONVIVATTU
            SET    IsDeleted = 1
            WHERE  Id = @Id
        END
END
GO
/****** Object:  StoredProcedure [dbo].[HANGTONKHO_INS]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name> 
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[HANGTONKHO_INS]
@IdPhieunhap int
AS
merge into HANGTONKHO t
	using (
	select chitiet.*, nhap.SupplierId SupplierId from PHIEUNHAPCHITIET chitiet 
	inner join PHIEUNHAP nhap on chitiet.StockReceivedDocketId = nhap.Id
	where chitiet.StockReceivedDocketId = @IdPhieunhap	AND chitiet.IsDeleted = 0
		) s 
	on ( t.SupplyId = s.SupplyId and t.SupplierId = s.SupplierId )
	when matched then
		update set
			Quantity = (
			SELECT SUM(Quantity) FROM PHIEUNHAPCHITIET chitiet
			inner join PHIEUNHAP nhap on chitiet.StockReceivedDocketId = nhap.Id
			where chitiet.IsDeleted = 0 AND chitiet.SupplyId = s.SupplyId AND nhap.SupplierId = s.SupplierId
			),
			QuantityRemain = 
			(
			SELECT SUM(Quantity) FROM PHIEUNHAPCHITIET chitiet
			inner join PHIEUNHAP nhap on chitiet.StockReceivedDocketId = nhap.Id
			where chitiet.IsDeleted = 0 AND chitiet.SupplyId = s.SupplyId AND nhap.SupplierId = s.SupplierId
			) -
			(
			SELECT ISNULL(SUM(Quantity),0) as number FROM PHIEUXUATCHITIET chitiet
			inner join PHIEUXUAT xuat on chitiet.DelieveryDocketId = xuat.Id
			where chitiet.SupplyId = t.Id and chitiet.IsDeleted = 0
			)
	when not matched then
		insert (SupplyId,Quantity, QuantityRemain, SupplierId, Description, IsDeleted, CreatorUserId, CreationTime)
		values (
			s.SupplyId ,s.Quantity, s.Quantity,s.SupplierId, N'Tự động tính toán bởi hệ thống', 0, 1, GETDATE() 
		);
		UPDATE PHIEUNHAP set TotalAmount = (SELECT SUM(chitiet.TotalAmount) as number FROM PHIEUNHAPCHITIET chitiet
			inner join PHIEUNHAP nhap on chitiet.StockReceivedDocketId = nhap.Id
			where chitiet.StockReceivedDocketId = @IdPhieunhap and chitiet.IsDeleted = 0) 
			where Id = @IdPhieunhap
GO
/****** Object:  StoredProcedure [dbo].[HANGTONKHO_OUT]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[HANGTONKHO_OUT]
@IdPhieuxuat int
as
BEGIN 

DECLARE @IdSupply INT
DECLARE @SoLuongThucTe INT
DECLARE @SoLuongTruDi INT
DECLARE @SoLuongCon INT
DECLARE @IdNhaCungCap INT
DECLARE @IdVATTU INT
    -- Get the current quantity remain
    SELECT @IdSupply = SupplyId
    FROM PHIEUXUATCHITIET
    WHERE Id = @IdPhieuxuat 
	--
	SELECT @SoLuongThucTe = Sum(Quantity)
    FROM HANGTONKHO
	WHere ID = @IdSupply and IsDeleted = 0
	--
	Select @SoLuongTruDi = SUM(Quantity)
	FROM PHIEUXUATCHITIET
	Where SupplyId = @IdSupply and IsDeleted = 0

	IF @SoLuongThucTe > @SoLuongTruDi and @SoLuongThucTe is not null
	BEGIN
		SET @SoLuongCon = @SoLuongThucTe - @SoLuongTruDi
		UPDATE HANGTONKHO 
		SET QuantityRemain = @SoLuongCon
		WHERE ID = @IdSupply

		UPDATE dbo.PHIEUXUAT set TotalAmount = (SELECT SUM(chitiet.TotalAmount) as number FROM dbo.PHIEUXUATCHITIET chitiet
			inner join dbo.PHIEUXUAT nhap on chitiet.DelieveryDocketId = nhap.Id
			where chitiet.DelieveryDocketId = @IdPhieuxuat and chitiet.IsDeleted = 0) 
			where Id = @IdPhieuxuat
	END
	ELSE
	BEGIN
		DECLARE @Quantity INT
	END
	END


			
GO
/****** Object:  StoredProcedure [dbo].[INSERT_VATTU]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[INSERT_VATTU]
	-- Add the parameters for the stored procedure here
	@SuppliesName nvarchar(50),
	@SuppliesType INT,
	@SuppliesUnit INT ,
	@SuppliesAmount BIGINT,
	@CreatorUserId BIGINT
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	INSERT INTO VATTU (SuppliesName,SuppliesType,SuppliesUnit,SuppliesAmount,IsDeleted,CreationTime,CreatorUserId)
	Values (@SuppliesName , @SuppliesType , @SuppliesUnit , @SuppliesAmount , 0 , GetDate() , @CreatorUserId)
END
GO
/****** Object:  StoredProcedure [dbo].[KHACHHANG_INS_UPD_DEL]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
/*KHACHHANG*/
CREATE PROCEDURE [dbo].[KHACHHANG_INS_UPD_DEL]
	-- Add the parameters for the stored procedure here
	@Id BIGINT,
	@CustomerName nvarchar(50),
	@GenderId bigint,
	@Phone varchar(15),
	@CreatorUserId bigint,
	@CreationTime datetime,
	@StatementType NVARCHAR(20) = ''
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

   IF @StatementType = 'Insert'
        BEGIN
            INSERT INTO KHACHHANG
                        (
                         
                         CustomerName,
						 GenderId,
						 Phone,
						 IsDeleted,
						 CreatorUserId,
						 CreationTime
						 )
            VALUES     (
                         
                         @CustomerName,
						 @GenderId,
						 @Phone,
						 0,
						 1,
						 getDate()
						 )
        END

     
      IF @StatementType = 'Update'
        BEGIN
            UPDATE KHACHHANG
            SET    
			       CustomerName = @CustomerName,
				   GenderId = @GenderId,
				   Phone = @Phone,
				   CreatorUserId = @CreatorUserId,
				   CreationTime = @CreationTime
            WHERE  Id = @Id
        END
      ELSE IF @StatementType = 'Delete'
        BEGIN
            UPDATE KHACHHANG
            SET    IsDeleted = 1
            WHERE  Id = @Id
        END
END
GO
/****** Object:  StoredProcedure [dbo].[LOAIVATTU_INS_UPD_DEL]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
/*LOAIVATTU*/
CREATE PROCEDURE [dbo].[LOAIVATTU_INS_UPD_DEL]
	-- Add the parameters for the stored procedure here
	@Id BIGINT,
	@Name nvarchar(50),
	@Ordering int,
	@CreatorUserId bigint,
	@CreationTime datetime,
	@StatementType NVARCHAR(20) = ''
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

   IF @StatementType = 'Insert'
        BEGIN
            INSERT INTO	LOAIVATTU
                        (
                         
                         Name,
						 Ordering,
						 IsDeleted,
						 CreatorUserId,
						 CreationTime
						 )
            VALUES     (
                         
                         @Name,
						 @Ordering,
						 0,
						 1,
						 getdate()
						 )
        END

     
      IF @StatementType = 'Update'
        BEGIN
            UPDATE LOAIVATTU
            SET    
			       Name = @Name,
				   Ordering = @Ordering,
				   CreatorUserId = @CreatorUserId,
				   CreationTime = @CreationTime
            WHERE  Id = @Id
        END
      ELSE IF @StatementType = 'Delete'
        BEGIN
            UPDATE LOAIVATTU
            SET    IsDeleted = 1
            WHERE  Id = @Id
        END
END
GO
/****** Object:  StoredProcedure [dbo].[NHACUNGCAP_INS_UPD_DEL]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
/*NHACUNGCAP*/
CREATE PROCEDURE [dbo].[NHACUNGCAP_INS_UPD_DEL]
	-- Add the parameters for the stored procedure here
	@Id BIGINT,
	@Supplier nvarchar(50),
	@Address nvarchar(50),
	@Phone varchar(15),
	@CreatorUserId bigint,
	@CreationTime datetime,
	@StatementType NVARCHAR(20) = ''
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

   IF @StatementType = 'Insert'
        BEGIN
            INSERT INTO	NHACUNGCAP
                        (
                         
						 Supplier,
						 Address,
						 Phone,
						 IsDeleted,
						 CreatorUserId,
						 CreationTime
                         
						 )
            VALUES     (
                         
						 @Supplier,
						 @Address,
						 @Phone,
						 0,
						 1,
						 GETDATE()
                         
						 )
        END

     
      IF @StatementType = 'Update'
        BEGIN
            UPDATE NHACUNGCAP
            SET    
			       Supplier = @Supplier,
				   Address = @Address,
				   Phone = @Phone,
				   CreatorUserId = @CreatorUserId,
				   CreationTime = @CreationTime
            WHERE  Id = @Id
        END
      ELSE IF @StatementType = 'Delete'
        BEGIN
            UPDATE NHACUNGCAP
            SET    IsDeleted = 1
            WHERE  Id = @Id
        END
END
GO
/****** Object:  StoredProcedure [dbo].[NHANVIEN_INS_UPD_DEL]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		TOANNTK
-- Create date: 6/12/2022
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[NHANVIEN_INS_UPD_DEL]
	-- Add the parameters for the stored procedure here
	@Id BIGINT,
	@EmployeeFirstName nvarchar(50),
	@EmployeeLastName nvarchar(50),
	@DateOfBirth datetime,
	@GenderId INT,
	@Phone varchar(20),
	@UserAccount varchar(20),
	@UserPassword varchar(20),
	@StatementType NVARCHAR(20) = ''
AS
BEGIN
	IF @StatementType = 'Insert'
        BEGIN
            INSERT INTO NHANVIEN
                        (
                         EmployeeFirstName,
                         EmployeeLastName,
                         DateOfBirth,
                         GenderId,
						 Phone,
						 UserAccount,
						 UserPassword,
						 IsDeleted,
						 CreationTime,
						 CreatorUserId
						 )
            VALUES     (
                         @EmployeeFirstName,
                         @EmployeeLastName,
                         @DateOfBirth,
                         @GenderId,
						 @Phone,
						 @UserAccount,
						 @UserPassword,
						 0,
						 getDate(),
						 1
						 )
        END

     
      IF @StatementType = 'Update'
        BEGIN
            UPDATE NHANVIEN
            SET    EmployeeFirstName = @EmployeeFirstName,
                   EmployeeLastName = @EmployeeLastName,
                   DateOfBirth = @DateOfBirth,
                   GenderId = @GenderId,
			       Phone = @Phone,
				   UserAccount = @UserAccount,
				   UserPassword = @UserPassword
            WHERE  Id = @Id
        END
      ELSE IF @StatementType = 'Delete'
        BEGIN
            UPDATE NHANVIEN
            SET    IsDeleted = 1
            WHERE  Id = @Id
        END
END
GO
/****** Object:  StoredProcedure [dbo].[PHIEUNHAP_INS_UPD_DEL]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
/*PHIEUNHAP*/
CREATE PROCEDURE [dbo].[PHIEUNHAP_INS_UPD_DEL]
	-- Add the parameters for the stored procedure here
	@Id BIGINT,
	@Code nvarchar(40),
	@OrderEntryDate datetime,
	@TotalAmout bigint,
	@SupplierId bigint,
	@EmployeeId bigint,
	@Description nvarchar(250),
	@CreatorUserId bigint,
	@CreationTime datetime,
	@StatementType NVARCHAR(20) = ''
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

   IF @StatementType = 'Insert'
        BEGIN
            INSERT INTO	PHIEUNHAP
                        (
                         
                         Code,
						 OrderEntryDate,
						 TotalAmount,
						 SupplierId,
						 EmployeeId,
						 Description,
						 IsDeleted,
						 CreatorUserId,
						 CreationTime
						 )
            VALUES     (
                         
                         @Code,
						 @OrderEntryDate,
						 @TotalAmout,
						 @SupplierId,
						 @EmployeeId,
						 @Description,
						 0,
						 1,
						 GETDATE()
						 )
        END

     
      IF @StatementType = 'Update'
        BEGIN
            UPDATE PHIEUNHAP
            SET    
			       Code = @Code,
				   OrderEntryDate = @OrderEntryDate,
				   TotalAmount = @TotalAmout,
				   SupplierId = @SupplierId,
				   EmployeeId = @EmployeeId,
				   Description = @Description,
				   CreatorUserId = @CreatorUserId,
				   CreationTime = @CreationTime
            WHERE  Id = @Id
        END
      ELSE IF @StatementType = 'Delete'
        BEGIN
            UPDATE PHIEUNHAP
            SET    IsDeleted = 1
            WHERE  Id = @Id
        END
END
GO
/****** Object:  StoredProcedure [dbo].[PHIEUNHAPCHITIET_INS_UPD_DEL]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
/*PHIEUNHAPCHITIET*/
CREATE PROCEDURE [dbo].[PHIEUNHAPCHITIET_INS_UPD_DEL]
	-- Add the parameters for the stored procedure here
	@Id BIGINT,
	@StockReceivedDocketId bigint,
	@SupplyId bigint,
	@Quanity int,
	@SupplyAmount bigint,
	@TotalAmount bigint,
	@Description nvarchar(250),
	@LocationId bigint,
	@CreatorUserId bigint,
	@CreationTime datetime,
	@StatementType NVARCHAR(20) = ''
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

   IF @StatementType = 'Insert'
        BEGIN
            INSERT INTO	PHIEUNHAPCHITIET
                        (
                         
						 StockReceivedDocketId,
						 SupplyId,
						 Quantity,
						 SupplyAmount,
						 TotalAmount,
						 Description,
						 LocationId,
						 IsDeleted,
						 CreatorUserId,
						 CreationTime
                         
						 )
            VALUES     (
                         
						 @StockReceivedDocketId,
						 @SupplyId,
						 @Quanity,
						 @SupplyAmount,
						 @TotalAmount,
						 @Description,
						 @LocationId,
						 0,
						 1,
						 GETDATE()
                         
						 )
        END

     
      IF @StatementType = 'Update'
        BEGIN
            UPDATE PHIEUNHAPCHITIET
            SET    
			       StockReceivedDocketId = @StockReceivedDocketId,
				   SupplyId = @SupplyId,
				   Quantity = @Quanity,
				   SupplyAmount = @SupplyAmount,
				   TotalAmount = @TotalAmount,
				   Description = @Description,
				   LocationId = @LocationId,
				   CreatorUserId = @CreatorUserId,
				   CreationTime = @CreationTime
            WHERE  Id = @Id
        END
      ELSE IF @StatementType = 'Delete'
        BEGIN
            UPDATE PHIEUNHAPCHITIET
            SET    IsDeleted = 1
            WHERE  Id = @Id
        END
END
GO
/****** Object:  StoredProcedure [dbo].[UPDATE_VATTU]    Script Date: 11/02/2023 10:27:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		Toan
-- Create date: 6/12/2022
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[UPDATE_VATTU]
	-- Add the parameters for the stored procedure here
	@Id BIGINT,
	@SuppliesName nvarchar(50),
	@SuppliesType INT,
	@SuppliesUnit INT ,
	@SuppliesAmount BIGINT
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	UPDATE VATTU
	Set SuppliesName = @SuppliesName , SuppliesType = @SuppliesType , SuppliesUnit = @SuppliesUnit , SuppliesAmount = @SuppliesAmount
	WHERE VATTU.Id = @Id
END
GO
