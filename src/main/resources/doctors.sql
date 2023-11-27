SELECT COUNT(id) as activeDoctors FROM cms_hospital.doctors WHERE status='active' AND last_delete_date is NULL;

insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (1, 'DID-1', 'denise', 'denise Banisch', 'dbanisch0@chron.com', 'à confirmer', 'femelle', '212428755020', 'Allergologue', '49 Lunder Avenue', null, '2023-07-05 19:36:56', '2023-08-27 14:39:57', '2026-04-18 15:02:25');
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (2, 'DID-2', 'lucie', 'lucie Eckart', 'leckart1@ebay.com', 'à confirmer', 'male', '212493351960', 'Dermatologue', '76527 Bay Lane', null, '2023-01-10 12:44:22', '2023-04-19 19:02:36', null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (3, 'DID-3', 'peg', 'peg Fanton', 'pfanton2@altervista.org', 'active', 'male', '212673555611', 'Cardiologue', '2 Hooker Crossing', 'peg.jpa', '2023-08-06 10:14:47', '2023-12-27 15:29:14', null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (4, 'DID-4', 'ewen', 'ewen Sailer', 'esailer3@e-recht24.de', 'active', 'male', '212086075157', 'Allergologue', '98 Ruskin Drive', null, '2023-03-08 06:02:23', null, '2025-07-08 03:15:06');
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (5, 'DID-5', 'isak', 'isak Ledgley', 'iledgley4@nyu.edu', 'inactive', 'femelle', '212139387753', 'Ophtalmologue', '4945 Waubesa Way', null, '2023-06-29 02:00:19', null, null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (6, 'DID-6', 'reba', 'reba Forder', 'rforder5@paypal.com', 'inactive', 'femelle', '212110286848', 'Gynécologue', '46 Bluejay Crossing', null, '2023-01-10 16:49:19', '2023-06-26 16:13:19', '2026-02-08 11:37:14');
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (7, 'DID-7', 'clarie', 'clarie Conman', 'cconman6@topsy.com', 'à confirmer', 'femelle', '212169363116', 'Allergologue', '761 Homewood Avenue', null, '2023-05-16 04:22:42', null, '2026-04-27 18:15:24');
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (8, 'DID-8', 'dew', 'dew Rappoport', 'drappoport7@wiley.com', 'active', 'femelle', '212741968425', 'Ophtalmologue', '68 Hallows Street', null, '2023-08-05 06:14:19', '2023-03-29 01:32:27', '2026-03-01 05:48:04');
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (9, 'DID-9', 'sybila', 'sybila Pires', 'spires8@freewebs.com', 'active', 'femelle', '212022423970', 'Cardiologue', '76 Porter Circle', null, '2023-07-28 22:25:45', '2023-09-02 23:16:31', null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (10, 'DID-10', 'janean', 'janean Izatson', 'jizatson9@unc.edu', 'à confirmer', 'male', '212380718929', 'Ophtalmologue', '4958 Banding Pass', 'janean.jpa', '2023-04-01 01:43:36', null, null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (11, 'DID-11', 'bealle', 'bealle Golder', 'bgoldera@github.com', 'à confirmer', 'femelle', '212206382953', 'Ophtalmologue', '060 East Place', null, '2023-09-13 09:38:43', null, null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (12, 'DID-12', 'thadeus', 'thadeus MacCome', 'tmaccomeb@com.com', 'à confirmer', 'male', '212176867256', 'Cardiologue', '89 Towne Circle', 'thadeus.png', '2023-09-27 14:11:12', null, null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (13, 'DID-13', 'iolande', 'iolande Schruurs', 'ischruursc@live.com', 'à confirmer', 'male', '212165025931', 'Ophtalmologue', '892 Rusk Terrace', null, '2023-10-15 11:20:02', null, null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (14, 'DID-14', 'keene', 'keene Landsbury', 'klandsburyd@ft.com', 'active', 'femelle', '212653576372', 'Gynécologue', '78 Bobwhite Terrace', 'keene.png', '2023-07-17 16:38:06', '2023-07-24 15:24:29', '2026-02-23 07:44:11');
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (15, 'DID-15', 'andrei', 'andrei Cassel', 'acassele@oracle.com', 'inactive', 'male', '212942507782', 'Dermatologue', '679 Crownhardt Center', 'andrei.png', '2023-09-22 13:17:07', null, '2026-05-08 15:05:15');
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (16, 'DID-16', 'neely', 'neely Haggerston', 'nhaggerstonf@bluehost.com', 'à confirmer', 'male', '212368174102', 'Gynécologue', '544 Independence Court', null, '2023-08-09 04:50:58', null, null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (17, 'DID-17', 'martie', 'martie Spikins', 'mspikinsg@intel.com', 'inactive', 'male', '212324622561', 'Cardiologue', '96346 Comanche Lane', null, '2023-09-01 20:05:55', '2023-06-02 11:40:21', null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (18, 'DID-18', 'ari', 'ari Smooth', 'asmoothh@reverbnation.com', 'inactive', 'femelle', '212666084063', 'Dermatologue', '979 Parkside Crossing', null, '2023-01-01 13:55:58', '2023-07-02 22:50:27', null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (19, 'DID-19', 'tamara', 'tamara Carbry', 'tcarbryi@techcrunch.com', 'inactive', 'femelle', '212493896469', 'Allergologue', '46 Memorial Street', 'tamara.png', '2023-01-12 07:14:45', null, null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (20, 'DID-20', 'nicolea', 'nicolea Posthill', 'nposthillj@sogou.com', 'active', 'femelle', '212240434191', 'Ophtalmologue', '62 Dawn Hill', 'nicolea.png', '2023-08-14 01:03:35', null, null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (21, 'DID-21', 'galina', 'galina Barfield', 'gbarfieldk@soup.io', 'active', 'male', '212484877805', 'Ophtalmologue', '5933 Roxbury Court', 'galina.png', '2023-05-16 15:28:16', '2023-11-24 12:59:26', '2025-06-26 14:38:52');
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (22, 'DID-22', 'august', 'august Whiffin', 'awhiffinl@nytimes.com', 'inactive', 'femelle', '212387175552', 'Cardiologue', '41839 Charing Cross Place', 'august.jpa', '2023-01-27 12:33:48', '2023-04-28 22:54:47', null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (23, 'DID-23', 'clair', 'clair Areles', 'carelesm@sbwire.com', 'active', 'male', '212459417848', 'Cardiologue', '94640 Holy Cross Parkway', 'clair.png', '2022-12-02 00:26:53', null, null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (24, 'DID-24', 'helaina', 'helaina Margach', 'hmargachn@fc2.com', 'inactive', 'femelle', '212032014861', 'Cardiologue', '200 Wayridge Circle', 'helaina.jpa', '2023-11-12 03:46:10', null, null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (25, 'DID-25', 'giuseppe', 'giuseppe Barneveld', 'gbarneveldo@cdc.gov', 'inactive', 'femelle', '212908182329', 'Allergologue', '52078 Pawling Terrace', 'giuseppe.png', '2023-10-01 16:58:00', null, null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (26, 'DID-26', 'dixie', 'dixie Letson', 'dletsonp@indiegogo.com', 'à confirmer', 'male', '212738996813', 'Dermatologue', '9560 Hauk Parkway', 'dixie.jpa', '2023-09-24 22:20:53', '2023-07-17 13:11:26', '2025-05-28 10:08:55');
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (27, 'DID-27', 'ashlen', 'ashlen Liveley', 'aliveleyq@indiatimes.com', 'active', 'femelle', '212650574240', 'Ophtalmologue', '5359 Bunker Hill Lane', 'ashlen.jpa', '2023-01-14 13:42:07', '2023-12-17 18:15:33', null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (28, 'DID-28', 'frannie', 'frannie Tedahl', 'ftedahlr@feedburner.com', 'inactive', 'femelle', '212139570868', 'Ophtalmologue', '7290 Lukken Road', null, '2023-06-25 16:51:07', null, '2025-08-12 12:10:12');
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (29, 'DID-29', 'jorie', 'jorie Large', 'jlarges@paypal.com', 'inactive', 'male', '212839110587', 'Gynécologue', '3 Lindbergh Drive', 'jorie.jpa', '2023-09-18 18:06:23', '2023-09-27 07:52:20', null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (30, 'DID-30', 'harman', 'harman O''Callaghan', 'hocallaghant@fotki.com', 'inactive', 'femelle', '212555686688', 'Dermatologue', '47 Hallows Crossing', 'harman.png', '2023-09-22 07:52:57', '2023-08-22 20:00:53', null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (31, 'DID-31', 'harold', 'harold Biaggioni', 'hbiaggioniu@fotki.com', 'inactive', 'male', '212831444974', 'Cardiologue', '6010 Killdeer Center', 'harold.png', '2023-05-24 05:33:35', null, null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (32, 'DID-32', 'wandie', 'wandie Mordue', 'wmorduev@godaddy.com', 'inactive', 'male', '212396520223', 'Ophtalmologue', '10231 Dryden Hill', null, '2023-04-04 17:42:43', '2023-05-21 08:10:17', null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (33, 'DID-33', 'georgette', 'georgette Bracco', 'gbraccow@va.gov', 'active', 'femelle', '212277984538', 'Cardiologue', '4 Gale Drive', null, '2023-10-20 21:15:16', '2023-08-12 20:16:23', null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (34, 'DID-34', 'glyn', 'glyn Caldwell', 'gcaldwellx@nbcnews.com', 'à confirmer', 'femelle', '212407831207', 'Allergologue', '21774 Mesta Alley', 'glyn.png', '2023-04-02 14:30:11', null, '2025-09-29 23:13:08');
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (35, 'DID-35', 'ddene', 'ddene Thumann', 'dthumanny@twitter.com', 'inactive', 'femelle', '212032611671', 'Gynécologue', '0447 New Castle Crossing', null, '2023-10-16 02:01:30', '2023-04-17 07:02:33', null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (36, 'DID-36', 'pascale', 'pascale Pieche', 'ppiechez@ihg.com', 'inactive', 'femelle', '212906409216', 'Dermatologue', '9 Main Hill', 'pascale.png', '2023-10-05 06:01:32', null, null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (37, 'DID-37', 'diena', 'diena Shipton', 'dshipton10@ning.com', 'à confirmer', 'femelle', '212477012677', 'Gynécologue', '0646 Nobel Junction', 'diena.png', '2023-03-09 12:08:39', null, null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (38, 'DID-38', 'marleah', 'marleah Larcher', 'mlarcher11@businesswire.com', 'active', 'male', '212106729003', 'Ophtalmologue', '108 Alpine Junction', 'marleah.png', '2023-10-12 11:56:06', null, null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (39, 'DID-39', 'sunshine', 'sunshine Luebbert', 'sluebbert12@wikimedia.org', 'inactive', 'male', '212231703714', 'Gynécologue', '12 Esker Crossing', 'sunshine.jpa', '2023-06-14 20:58:57', '2023-06-15 21:46:11', '2026-05-05 08:49:31');
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (40, 'DID-40', 'donni', 'donni Pruckner', 'dpruckner13@reference.com', 'à confirmer', 'femelle', '212511622835', 'Gynécologue', '579 Holmberg Point', 'donni.png', '2022-12-14 01:39:39', null, '2026-03-19 08:49:58');
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (41, 'DID-41', 'cheri', 'cheri Brandin', 'cbrandin14@uiuc.edu', 'active', 'femelle', '212873884759', 'Gynécologue', '519 Huxley Junction', 'cheri.png', '2023-09-25 15:55:53', '2023-02-17 16:38:06', '2026-02-06 17:44:36');
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (42, 'DID-42', 'calhoun', 'calhoun Targetter', 'ctargetter15@livejournal.com', 'à confirmer', 'male', '212110789014', 'Ophtalmologue', '8982 Thackeray Junction', 'calhoun.png', '2023-06-03 02:35:50', null, null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (43, 'DID-43', 'rem', 'rem Tesauro', 'rtesauro16@mit.edu', 'à confirmer', 'femelle', '212479635438', 'Dermatologue', '795 Hermina Circle', null, '2023-11-14 08:42:25', '2023-05-04 07:49:23', null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (44, 'DID-44', 'frankie', 'frankie Geerling', 'fgeerling17@google.com', 'inactive', 'femelle', '212816583234', 'Dermatologue', '69901 Hazelcrest Place', 'frankie.jpa', '2023-03-18 10:43:24', null, null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (45, 'DID-45', 'tasia', 'tasia Antonignetti', 'tantonignetti18@wordpress.org', 'active', 'male', '212093879177', 'Gynécologue', '873 Kennedy Point', 'tasia.png', '2023-07-23 19:04:16', null, null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (46, 'DID-46', 'brit', 'brit Showers', 'bshowers19@geocities.com', 'à confirmer', 'male', '212021979312', 'Cardiologue', '0 Warbler Trail', 'brit.png', '2023-05-04 01:12:29', '2023-03-24 09:48:50', null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (47, 'DID-47', 'valentia', 'valentia Jovey', 'vjovey1a@gravatar.com', 'active', 'male', '212463333145', 'Cardiologue', '44 Haas Court', 'valentia.jpa', '2023-07-04 19:15:31', null, '2026-04-16 17:31:39');
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (48, 'DID-48', 'guido', 'guido Imlacke', 'gimlacke1b@shareasale.com', 'inactive', 'femelle', '212589373989', 'Allergologue', '611 Melby Pass', 'guido.jpa', '2023-09-05 22:56:21', null, null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (49, 'DID-49', 'laney', 'laney Blainey', 'lblainey1c@com.com', 'inactive', 'male', '212696777883', 'Ophtalmologue', '1 Myrtle Court', 'laney.jpa', '2023-11-25 05:10:43', '2023-02-28 00:40:05', null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (50, 'DID-50', 'arlene', 'arlene Cunde', 'acunde1d@arstechnica.com', 'active', 'femelle', '212397595693', 'Cardiologue', '6 Ronald Regan Plaza', 'arlene.png', '2023-09-25 21:25:37', '2023-05-13 21:17:35', null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (51, 'DID-51', 'carlotta', 'carlotta Jansik', 'cjansik1e@stanford.edu', 'inactive', 'male', '212558321545', 'Ophtalmologue', '1677 Burning Wood Way', 'carlotta.png', '2023-05-13 19:03:40', '2023-05-11 17:23:25', '2025-06-16 18:49:24');
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (52, 'DID-52', 'raychel', 'raychel Schoffler', 'rschoffler1f@imageshack.us', 'inactive', 'male', '212734965707', 'Allergologue', '88 Fallview Center', 'raychel.png', '2023-05-12 11:21:52', null, null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (53, 'DID-53', 'jacenta', 'jacenta MacGaffey', 'jmacgaffey1g@samsung.com', 'active', 'male', '212535152932', 'Allergologue', '3159 Steensland Road', 'jacenta.png', '2023-11-09 10:29:02', null, null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (54, 'DID-54', 'ezri', 'ezri Duberry', 'eduberry1h@godaddy.com', 'à confirmer', 'femelle', '212074726590', 'Cardiologue', '1289 Westend Junction', 'ezri.jpa', '2023-08-03 20:24:25', '2023-02-25 16:51:01', null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (55, 'DID-55', 'chance', 'chance Hindes', 'chindes1i@amazon.de', 'à confirmer', 'femelle', '212553658947', 'Allergologue', '5 Golden Leaf Circle', 'chance.jpa', '2023-01-30 22:55:54', null, null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (56, 'DID-56', 'adey', 'adey Jakoviljevic', 'ajakoviljevic1j@shop-pro.jp', 'à confirmer', 'male', '212463495035', 'Allergologue', '6 Menomonie Parkway', 'adey.jpa', '2023-03-02 04:29:23', null, '2025-09-22 21:54:16');
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (57, 'DID-57', 'sheffield', 'sheffield Clampton', 'sclampton1k@fc2.com', 'inactive', 'femelle', '212267930553', 'Allergologue', '9 Pine View Way', 'sheffield.jpa', '2023-03-31 07:17:40', '2023-08-05 03:45:45', null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (58, 'DID-58', 'adelina', 'adelina Getcliff', 'agetcliff1l@smugmug.com', 'à confirmer', 'male', '212806944458', 'Cardiologue', '88 Mariners Cove Terrace', null, '2023-05-01 14:13:55', null, null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (59, 'DID-59', 'tally', 'tally Clyne', 'tclyne1m@51.la', 'inactive', 'male', '212621142387', 'Dermatologue', '58294 Texas Alley', null, '2022-12-13 06:54:38', null, null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (60, 'DID-60', 'chevalier', 'chevalier Radloff', 'cradloff1n@themeforest.net', 'à confirmer', 'femelle', '212305767731', 'Gynécologue', '60 Cordelia Trail', 'chevalier.png', '2023-08-22 10:52:14', '2023-07-11 04:04:32', null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (61, 'DID-61', 'kristos', 'kristos Ramard', 'kramard1o@ft.com', 'à confirmer', 'male', '212609261286', 'Gynécologue', '72058 Ilene Circle', 'kristos.jpa', '2023-03-23 04:02:23', null, null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (62, 'DID-62', 'samara', 'samara Double', 'sdouble1p@spiegel.de', 'à confirmer', 'femelle', '212357131102', 'Allergologue', '068 Schiller Court', 'samara.jpa', '2023-03-02 17:47:39', null, '2025-06-12 07:01:16');
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (63, 'DID-63', 'taddeusz', 'taddeusz Mitie', 'tmitie1q@princeton.edu', 'active', 'male', '212503371425', 'Dermatologue', '54957 Thierer Junction', 'taddeusz.jpa', '2023-08-01 20:14:13', '2023-03-23 01:07:05', null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (64, 'DID-64', 'demetris', 'demetris Cauthra', 'dcauthra1r@vimeo.com', 'inactive', 'femelle', '212608499273', 'Cardiologue', '28944 International Drive', 'demetris.png', '2023-08-11 02:15:42', '2023-08-03 16:50:34', null);
insert into doctors (id, doctorId, password, full_name, email, status, gender, mobile, specialized, address, image, date, last_modify_date, last_delete_date) values (65, 'DID-65', 'dante', 'dante Barme', 'dbarme1s@shop-pro.jp', 'à confirmer', 'male', '212784118032', 'Gynécologue', '61479 Becker Center', 'dante.png', '2023-04-03 20:45:08', null, null);