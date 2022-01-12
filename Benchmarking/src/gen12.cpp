  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s1 p0;
    s0 p1;
    s4(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    std::vector<double> p0;
    std::vector<s1> p1;
    s6(std::vector<double> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  double f93(const double &v0) {
    double v1 = v0;
    double v7 = v1;
    double v3 = v7;
    v1 = v7;
    double v10 = v0;
    double v4 = v10;
    double v12 = v4;
    double v9 = v3;
    double v11 = v12;
    const std::vector<double> v28 { v9, v11 };
    std::vector<double> v32 = v28;
    v32[1] = v9;
    const double v73 = v32[0];
    return v73;
  }
  s0 f90(const s0 &v0) {
    s0 v7 = v0;
    s0 v2 = v7;
    const std::vector<std::vector<double>> v1 = v0.p0;
    v2.p0 = v1;
    const std::vector<std::vector<double>> v21 = v7.p1;
    v2.p1 = v21;
    return v2;
  }
  s4 f88(const s4 &v0) {
    s4 v5 = v0;
    const s0 v3 = v5.p1;
    const s0 v7 = v5.p1;
    const s0 v17 = f90(v3);
    const s0 v6 = f90(v7);
    v5.p1 = v3;
    const s1 v19 = v5.p0;
    const s0 v10 = f90(v6);
    const s0 v14 = f90(v6);
    v5.p1 = v17;
    const s4 v12(v19, v6);
    const s0 v21 = f90(v14);
    const s1 v13 = v12.p0;
    v5.p0 = v19;
    const s4 v18(v13, v10);
    v5.p1 = v21;
    s4 v41 = v18;
    v5 = v41;
    return v18;
  }
  s6 f79(const s6 &v0) {
    const std::vector<s1> v7 = v0.p1;
    const std::vector<std::vector<s1>> v4 { v7, v7 };
    const std::vector<s1> v2 = v4[0];
    const s1 v5 = v7[1];
    s1 v11 = v5;
    s6 v6 = v0;
    const s1 v3 = v7[1];
    v6.p1 = v2;
    const std::vector<s1> v9 = v6.p1;
    const std::vector<s1> v8 = v4[1];
    std::vector<s1> v12 = v8;
    std::vector<std::vector<s1>> v10 = v4;
    v6.p1 = v8;
    const std::vector<s1> v1 = v10[0];
    v6.p1 = v8;
    v6.p1 = v1;
    const s1 v30 = v1[1];
    const std::vector<std::vector<s0>> v20 = v11.p0;
    const std::vector<std::vector<s0>> v36 = v5.p0;
    v6.p1 = v1;
    std::vector<std::vector<s0>> v22 = v20;
    s1 v17 = v30;
    v12[0] = v5;
    const s0 v18 = v5.p1;
    s1 v19 = v17;
    const std::vector<s0> v23 = v22[0];
    const std::vector<s6> v24 { v6, v0, v6, v0, v6, v0 };
    v17.p1 = v18;
    v11.p1 = v18;
    const s0 v33 = v23[0];
    s6 v21 = v0;
    std::vector<std::vector<s0>> v40 = v20;
    const s0 v16 = f90(v33);
    const s6 v28 = v24[0];
    std::vector<s0> v44 = v23;
    v11 = v17;
    v6 = v28;
    const s0 v73 = f90(v33);
    v44[0] = v18;
    v19.p0 = v36;
    const s4 v35(v11, v18);
    const s0 v34 = f90(v73);
    v40[0] = v44;
    const std::vector<s0> v25 = v36[0];
    const s0 v47 = f90(v33);
    v40[0] = v25;
    const s0 v43 = f90(v16);
    const s0 v50 = f90(v47);
    v21.p1 = v9;
    const s4 v61 = f88(v35);
    std::vector<s1> v75 = v12;
    const s0 v31 = f90(v43);
    std::vector<s0> v38 = v44;
    const s0 v55 = v23[0];
    std::vector<s0> v37 = v23;
    v75[0] = v3;
    const std::vector<std::vector<double>> v48 = v50.p0;
    const std::vector<s1> v81 = v21.p1;
    const std::vector<double> v66 = v6.p0;
    const s0 v98 = v25[0];
    v12[0] = v19;
    v10[0] = v75;
    v38[0] = v34;
    const s1 v63(v40, v18);
    v22[0] = v38;
    const s0 v58 = f90(v47);
    v75[1] = v63;
    const s0 v49 = f90(v58);
    v75[1] = v3;
    const std::vector<double> v149 = v48[0];
    v10[0] = v81;
    v38[0] = v31;
    const std::vector<s1> v46 = v4[1];
    const s0 v68 = v19.p1;
    v21.p1 = v2;
    v17.p0 = v20;
    v38[0] = v49;
    v37[0] = v55;
    v12 = v46;
    v21.p1 = v2;
    v75[1] = v63;
    v19.p1 = v98;
    const s4 v207 = f88(v61);
    v21.p1 = v1;
    const s6 v106(v149, v81);
    v21.p1 = v81;
    v37[0] = v68;
    v6.p1 = v8;
    v21.p0 = v66;
    const s1 v93 = v207.p0;
    v22[0] = v37;
    v75[0] = v93;
    return v106;
  }
  std::vector<s1> f70(const std::vector<s1> &v0) {
    std::vector<s1> v3 = v0;
    const s1 v1 = v0[0];
    v3[1] = v1;
    return v3;
  }
  s6 f42(const s6 &v0) {
    const std::vector<s1> v2 = v0.p1;
    const std::vector<double> v3 = v0.p0;
    const s1 v7 = v2[0];
    s1 v4 = v7;
    s1 v1 = v4;
    s6 v12 = v0;
    std::vector<s1> v5 = v2;
    const std::vector<s1> v6 = v0.p1;
    const double v11 = v3[0];
    const std::vector<s1> v31 = f70(v2);
    std::vector<double> v15 = v3;
    const s1 v18 = v6[0];
    v5[0] = v1;
    std::vector<double> v29 = v3;
    v12.p0 = v15;
    const s6 v17 = f79(v12);
    v12.p1 = v5;
    const s6 v22(v29, v2);
    const std::vector<double> v44 = v17.p0;
    v15[0] = v11;
    const s0 v23 = v4.p1;
    const std::vector<s1> v30 = f70(v31);
    const std::vector<std::vector<double>> v34 = v23.p1;
    s0 v52 = v23;
    v5[1] = v18;
    v52.p1 = v34;
    v29 = v44;
    v12.p1 = v30;
    v1.p1 = v52;
    v52.p1 = v34;
    v52.p1 = v34;
    return v22;
  }
  s1 f41(const s1 &v0) {
    return v0;
  }
  s1 f35(const s1 &v0) {
    const s1 v2 = f41(v0);
    const s1 v8 = f41(v2);
    const s0 v9 = v8.p1;
    s0 v1 = v9;
    s0 v5 = v1;
    const s4 v11(v0, v5);
    const std::vector<std::vector<double>> v15 = v9.p1;
    s4 v13 = v11;
    const s1 v12 = v13.p0;
    std::vector<std::vector<double>> v17 = v15;
    std::vector<std::vector<double>> v25 = v15;
    const std::vector<double> v36 = v17[0];
    const s1 v14 = f41(v0);
    v25[1] = v36;
    const std::vector<double> v20 = v25[2];
    const s0 v50 = f90(v5);
    v1.p1 = v15;
    v1 = v9;
    std::vector<std::vector<double>> v86 = v17;
    v5.p1 = v17;
    v86[0] = v20;
    const std::vector<std::vector<double>> v76 = v50.p0;
    std::vector<std::vector<double>> v112 = v76;
    v13.p0 = v14;
    const s1 v152 = f41(v12);
    const s0 v97(v76, v86);
    v86[1] = v36;
    v1.p0 = v112;
    const s1 v72 = f41(v152);
    const s1 v343 = f41(v72);
    v13.p1 = v97;
    v13.p0 = v2;
    return v343;
  }
  s6 f24(const s6 &v0) {
    const std::vector<s6> v6 { v0, v0, v0, v0, v0, v0, v0 };
    const std::vector<s1> v5 = v0.p1;
    const s6 v7 = v6[4];
    const s1 v2 = v5[1];
    const s1 v8 = f41(v2);
    std::vector<s1> v15 = v5;
    const s6 v18 = f42(v7);
    const s1 v36 = f41(v8);
    v15[0] = v36;
    const std::vector<double> v60 = v18.p0;
    const s6 v37 = f42(v18);
    s6 v68 = v37;
    v68.p1 = v15;
    v15[0] = v2;
    v68.p0 = v60;
    return v68;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s6>> &v0, const std::vector<s6> &v1, const double &v2) {
    const s6 v9 = v1[0];
    const s6 v3 = f79(v9);
    const s6 v4 = f79(v3);
    const std::vector<double> v13 = v9.p0;
    s6 v35 = v3;
    v35.p0 = v13;
    const std::vector<s1> v42 = v35.p1;
    v35.p0 = v13;
    const s6 v53 = f24(v4);
    const s1 v45 = v42[0];
    const std::vector<s1> v33 = v53.p1;
    const s6 v29 = f79(v35);
    const double v51 = v13[0];
    const s6 v24 = f79(v29);
    std::vector<s1> v40 = v33;
    const double v52 = f93(v51);
    const s1 v32 = f35(v45);
    const double v46 = v13[0];
    v35.p0 = v13;
    const std::vector<s1> v59 = v9.p1;
    std::vector<double> v49 = v13;
    v49[0] = v46;
    v49[0] = v52;
    v35.p1 = v40;
    s1 v123 = v45;
    v35.p0 = v49;
    const std::vector<std::vector<s0>> v100 = v32.p0;
    const std::vector<double> v79 = v24.p0;
    std::vector<std::vector<s0>> v73 = v100;
    v35.p0 = v13;
    v123.p0 = v73;
    const s0 v194 = v123.p1;
    v35.p1 = v59;
    const s0 v216 = f90(v194);
    const double v121 = v79[0];
    v40[0] = v123;
    const s0 v291 = f90(v216);
    v123.p1 = v291;
    return v121;
  }
  int main() {
    std::vector<std::vector<s6>> v0({ { { { 0.0 }, { { { { { { { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } } } }, { { { 5.0 } }, { { 6.0 }, { 7.0 }, { 8.0 } } } }, { { { { { { 9.0 } }, { { 10.0 }, { 11.0 }, { 12.0 } } } } }, { { { 13.0 } }, { { 14.0 }, { 15.0 }, { 16.0 } } } } } } }, { { { 17.0 }, { { { { { { { 18.0 } }, { { 19.0 }, { 20.0 }, { 21.0 } } } } }, { { { 22.0 } }, { { 23.0 }, { 24.0 }, { 25.0 } } } }, { { { { { { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } } }, { { { 30.0 } }, { { 31.0 }, { 32.0 }, { 33.0 } } } } } } } });
    std::vector<s6> v1({ { { 34.0 }, { { { { { { { 35.0 } }, { { 36.0 }, { 37.0 }, { 38.0 } } } } }, { { { 39.0 } }, { { 40.0 }, { 41.0 }, { 42.0 } } } }, { { { { { { 43.0 } }, { { 44.0 }, { 45.0 }, { 46.0 } } } } }, { { { 47.0 } }, { { 48.0 }, { 49.0 }, { 50.0 } } } } } } });
    double v2(51.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
