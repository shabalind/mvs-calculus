  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s2(s1 v0): p0(v0) { }
  };
  struct s4 {
    s2 p0;
    std::vector<s0> p1;
    s4(s2 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s2 p0;
    std::vector<s4> p1;
    s5(s2 v0, std::vector<s4> v1): p0(v0), p1(v1) { }
  };
  s2 f122(const s0 &v0, const s2 &v1) {
    const s1 v17 = v1.p0;
    const s2 v33(v17);
    const s1 v26 = v33.p0;
    s2 v51 = v33;
    const std::vector<s2> v103 { v51, v33, v33 };
    const s2 v167 = v103[0];
    v51.p0 = v26;
    return v167;
  }
  s1 f115(const s1 &v0, const s4 &v1) {
    const s2 v6 = v1.p0;
    s2 v3 = v6;
    v3.p0 = v0;
    const s1 v32 = v3.p0;
    return v32;
  }
  s4 f103(const s4 &v0, const s4 &v1) {
    s4 v3 = v1;
    const std::vector<s0> v8 = v3.p1;
    s4 v11 = v1;
    const s0 v5 = v8[0];
    s0 v7 = v5;
    const s0 v6 = v8[0];
    v3.p1 = v8;
    std::vector<s0> v12 = v8;
    v3.p1 = v12;
    v12[0] = v7;
    const s0 v10 = v12[0];
    const s0 v4 = v12[0];
    s4 v9 = v3;
    const s0 v14 = v12[0];
    const s2 v2 = v1.p0;
    const s0 v21 = v8[0];
    const s2 v25 = v3.p0;
    v12[0] = v4;
    v9.p0 = v25;
    v9.p0 = v2;
    v12[0] = v10;
    v12[0] = v14;
    const s0 v26 = v12[0];
    const s1 v15 = v25.p0;
    const s2 v18 = f122(v5, v25);
    const s1 v30 = f115(v15, v0);
    const std::vector<double> v23 = v7.p1;
    const s2 v16(v15);
    v12[0] = v7;
    const std::vector<std::vector<double>> v24 = v6.p0;
    s1 v20 = v30;
    v11 = v0;
    const s0 v75 = v20.p1;
    v12[0] = v6;
    std::vector<s0> v28 = v12;
    const double v48 = v23[1];
    s1 v35 = v30;
    const std::vector<std::vector<double>> v47 = v14.p0;
    const std::vector<s0> v57 = v35.p0;
    const s1 v40 = v16.p0;
    s2 v29 = v16;
    v20.p0 = v57;
    v3 = v9;
    const s1 v38 = f115(v40, v1);
    v35.p1 = v6;
    v20.p1 = v5;
    const s1 v44 = f115(v38, v11);
    const std::vector<double> v65 = v24[0];
    v28[0] = v5;
    const std::vector<double> v33 = v21.p1;
    v29.p0 = v44;
    s0 v98 = v7;
    const std::vector<std::vector<double>> v46 = v5.p0;
    const std::vector<s0> v37 = v1.p1;
    v29.p0 = v30;
    v28 = v37;
    std::vector<std::vector<double>> v85 = v46;
    std::vector<double> v41 = v33;
    v35.p0 = v57;
    s2 v108 = v29;
    v12[0] = v75;
    const s0 v160 = v12[0];
    const s1 v89 = f115(v35, v0);
    v12 = v28;
    v85[0] = v65;
    v9.p0 = v25;
    v3.p0 = v18;
    const std::vector<double> v45 = v47[0];
    v85[0] = v65;
    v28[0] = v26;
    v85[0] = v45;
    v41[1] = v48;
    v12[0] = v160;
    v85 = v46;
    const s4 v74(v108, v28);
    v3.p0 = v16;
    v20.p0 = v57;
    const std::vector<double> v113 = v85[0];
    v29.p0 = v89;
    const double v182 = v113[0];
    v41[1] = v182;
    v7.p1 = v41;
    v7 = v98;
    v11.p1 = v8;
    return v74;
  }
  double f99(const double &v0) {
    double v8 = v0;
    double v4 = v0;
    double v3 = v4;
    double v1 = v3;
    const std::vector<double> v2 { v0, v1, v1, v3 };
    std::vector<double> v9 = v2;
    v9[1] = v8;
    const std::vector<std::vector<double>> v7 { v9, v2, v2, v9, v9 };
    v9[0] = v3;
    std::vector<std::vector<double>> v15 = v7;
    const std::vector<double> v23 = v15[3];
    std::vector<double> v12 = v23;
    v12[1] = v3;
    const double v22 = v12[0];
    return v22;
  }
  s0 f95(const s0 &v0) {
    const std::vector<std::vector<double>> v1 = v0.p0;
    s0 v4 = v0;
    const std::vector<double> v7 = v4.p1;
    const std::vector<double> v9 = v1[0];
    std::vector<std::vector<double>> v8 = v1;
    const double v11 = v9[0];
    double v14 = v11;
    s0 v13 = v4;
    v8[0] = v9;
    const std::vector<double> v20 = v8[0];
    const std::vector<double> v19 = v0.p1;
    std::vector<std::vector<double>> v21 = v8;
    const std::vector<double> v25 = v4.p1;
    const std::vector<std::vector<double>> v36 = v0.p0;
    std::vector<double> v15 = v20;
    const std::vector<double> v17 = v4.p1;
    v4.p0 = v36;
    const std::vector<double> v43 = v13.p1;
    const double v55 = f99(v14);
    const std::vector<double> v30 = v13.p1;
    const s0 v26(v36, v7);
    v13.p1 = v19;
    v13.p1 = v17;
    const std::vector<std::vector<double>> v93 = v0.p0;
    std::vector<std::vector<double>> v52 = v93;
    s0 v31 = v13;
    v52[0] = v15;
    const double v23 = f99(v55);
    const std::vector<double> v76 = v36[0];
    const std::vector<std::vector<double>> v58 = v31.p0;
    v52[0] = v20;
    const std::vector<std::vector<double>> v40 = v26.p0;
    v21 = v52;
    v8[0] = v9;
    v8[0] = v76;
    const std::vector<double> v92 = v31.p1;
    v31.p1 = v92;
    double v83 = v23;
    v13.p1 = v17;
    const std::vector<std::vector<std::vector<double>>> v53 { v93, v52, v21, v58, v36, v21, v40 };
    v13.p0 = v1;
    v15[0] = v83;
    v13.p0 = v52;
    v4.p0 = v1;
    v13.p1 = v30;
    v13.p1 = v43;
    const std::vector<std::vector<double>> v85 = v53[4];
    v31.p0 = v1;
    const std::vector<std::vector<double>> v78 = v13.p0;
    v4.p0 = v85;
    s0 v97 = v13;
    v97.p1 = v25;
    v97.p0 = v78;
    v31.p0 = v93;
    return v97;
  }
  std::vector<s0> f93(const std::vector<s0> &v0) {
    const s0 v5 = v0[0];
    const s0 v3 = f95(v5);
    const std::vector<std::vector<s0>> v2 { v0 };
    const s0 v17 = v0[0];
    const std::vector<std::vector<double>> v9 = v17.p0;
    const s0 v11 = f95(v3);
    const s0 v6 = v0[0];
    const s0 v7 = v0[0];
    std::vector<s0> v12 = v0;
    const std::vector<double> v10 = v3.p1;
    const std::vector<std::vector<double>> v20 = v5.p0;
    s0 v15 = v11;
    const std::vector<s0> v25 = v2[0];
    const std::vector<double> v16 = v11.p1;
    const std::vector<s0> v21 = v2[0];
    const s0 v33 = f95(v17);
    v12[0] = v5;
    const s0 v32 = f95(v17);
    const s0 v29(v9, v16);
    const s0 v24(v20, v10);
    v12[0] = v15;
    v12[0] = v33;
    const std::vector<double> v31 = v20[0];
    const std::vector<s0> v50 = v2[0];
    const std::vector<std::vector<s0>> v43 { v12, v21, v50, v25 };
    v15.p0 = v9;
    std::vector<s0> v63 = v25;
    const std::vector<std::vector<double>> v36 = v24.p0;
    std::vector<double> v80 = v31;
    v12 = v63;
    v15.p0 = v20;
    v63[0] = v29;
    std::vector<std::vector<double>> v49 = v36;
    v49[0] = v80;
    const s0 v62 = f95(v24);
    const std::vector<std::vector<double>> v45 = v29.p0;
    v15.p0 = v9;
    const std::vector<std::vector<double>> v40 = v32.p0;
    v49[0] = v31;
    v15.p0 = v49;
    v15.p0 = v49;
    s0 v101 = v6;
    const s0 v124 = f95(v7);
    const std::vector<s0> v151 = v43[0];
    v12[0] = v62;
    const std::vector<std::vector<double>> v289 = v101.p0;
    v15.p0 = v40;
    v101.p0 = v49;
    v15.p0 = v45;
    v15.p0 = v289;
    const s0 v129 = f95(v124);
    v63[0] = v129;
    return v151;
  }
  std::vector<s0> f91(const std::vector<s0> &v0) {
    const std::vector<s0> v8 = f93(v0);
    const std::vector<s0> v17 = f93(v8);
    const std::vector<s0> v40 = f93(v17);
    std::vector<s0> v41 = v40;
    return v41;
  }
  s2 f85(const s2 &v0) {
    const s1 v4 = v0.p0;
    s2 v1 = v0;
    v1.p0 = v4;
    s2 v42 = v1;
    v1 = v42;
    return v1;
  }
  s2 f70(const s2 &v0) {
    const s2 v2 = f85(v0);
    const s2 v10 = f85(v2);
    s2 v32 = v10;
    return v32;
  }
  std::vector<s0> f66(const std::vector<s0> &v0) {
    const std::vector<s0> v5 = f91(v0);
    const s0 v4 = v5[0];
    std::vector<s0> v7 = v5;
    const s0 v2 = v7[0];
    v7[0] = v2;
    const s0 v6 = v0[0];
    v7[0] = v6;
    std::vector<s0> v9 = v7;
    const std::vector<double> v12 = v4.p1;
    const s0 v18 = f95(v6);
    const s0 v23 = f95(v18);
    const std::vector<std::vector<double>> v30 = v6.p0;
    std::vector<s0> v33 = v5;
    s0 v27 = v23;
    std::vector<std::vector<double>> v21 = v30;
    const std::vector<std::vector<double>> v17 = v2.p0;
    const std::vector<std::vector<double>> v40 = v27.p0;
    std::vector<s0> v25 = v33;
    s0 v28 = v27;
    const std::vector<double> v49 = v23.p1;
    v27.p1 = v12;
    v27.p1 = v12;
    const std::vector<double> v19 = v17[0];
    v25 = v9;
    v27.p0 = v40;
    v33[0] = v28;
    v28.p1 = v49;
    const std::vector<std::vector<double>> v50 = v2.p0;
    v33[0] = v2;
    v27.p0 = v17;
    v9[0] = v23;
    v28.p0 = v21;
    v27.p0 = v50;
    std::vector<std::vector<double>> v103 = v21;
    v103[0] = v19;
    v27.p0 = v103;
    v9[0] = v28;
    return v25;
  }
  s4 f18(const s4 &v0) {
    const s4 v4 = f103(v0, v0);
    s4 v5 = v4;
    s4 v2 = v0;
    const s2 v7 = v5.p0;
    v2.p0 = v7;
    v5.p0 = v7;
    s4 v22 = v0;
    s2 v17 = v7;
    const s2 v24 = v0.p0;
    const s2 v10 = v22.p0;
    v22.p0 = v10;
    v5.p0 = v10;
    v2.p0 = v17;
    s2 v27 = v17;
    const s1 v26 = v24.p0;
    const s2 v16 = f70(v7);
    s4 v25 = v0;
    v25.p0 = v27;
    const std::vector<s0> v72 = v4.p1;
    v27 = v17;
    const s4 v46(v17, v72);
    v25 = v2;
    const std::vector<s4> v55 { v5, v25, v46, v0 };
    const std::vector<s0> v98 = f66(v72);
    v25.p1 = v72;
    v17.p0 = v26;
    const s4 v89 = v55[0];
    v2.p0 = v16;
    v2.p1 = v98;
    return v89;
  }
  __attribute__((noinline))
  double f0(const s5 &v0, const double &v1) {
    const std::vector<s4> v7 = v0.p1;
    const s4 v3 = v7[0];
    const s4 v17 = f18(v3);
    const std::vector<s0> v25 = v17.p1;
    const s0 v20 = v25[0];
    const std::vector<double> v41 = v20.p1;
    const double v122 = f99(v1);
    const double v104 = v41[0];
    const double v264 = v122 + v104;
    return v264;
  }
  int main() {
    s5 v0({ { { { { { { 0.0 } }, { 1.0, 2.0 } }, { { { 3.0 } }, { 4.0, 5.0 } }, { { { 6.0 } }, { 7.0, 8.0 } } }, { { { 9.0 } }, { 10.0, 11.0 } } } }, { { { { { { { { 12.0 } }, { 13.0, 14.0 } }, { { { 15.0 } }, { 16.0, 17.0 } }, { { { 18.0 } }, { 19.0, 20.0 } } }, { { { 21.0 } }, { 22.0, 23.0 } } } }, { { { { 24.0 } }, { 25.0, 26.0 } } } }, { { { { { { { 27.0 } }, { 28.0, 29.0 } }, { { { 30.0 } }, { 31.0, 32.0 } }, { { { 33.0 } }, { 34.0, 35.0 } } }, { { { 36.0 } }, { 37.0, 38.0 } } } }, { { { { 39.0 } }, { 40.0, 41.0 } } } } } });
    double v1(42.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
