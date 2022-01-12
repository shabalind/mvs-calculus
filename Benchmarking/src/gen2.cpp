  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f80(const s0 &v0) {
    const std::vector<double> v5 = v0.p0;
    const std::vector<std::vector<double>> v2 = v0.p1;
    const std::vector<double> v3 = v0.p0;
    s0 v11 = v0;
    const std::vector<std::vector<std::vector<double>>> v1 { v2, v2, v2, v2, v2, v2 };
    std::vector<std::vector<std::vector<double>>> v10 = v1;
    v10[5] = v2;
    std::vector<std::vector<std::vector<double>>> v12 = v1;
    const std::vector<std::vector<double>> v17 = v11.p1;
    v11.p0 = v3;
    const std::vector<std::vector<double>> v19 = v0.p1;
    v11.p1 = v2;
    const s0 v42(v3, v17);
    const std::vector<double> v14 = v11.p0;
    const std::vector<std::vector<double>> v16 = v0.p1;
    std::vector<std::vector<std::vector<double>>> v45 = v10;
    v12[0] = v16;
    const std::vector<double> v23 = v11.p0;
    const std::vector<std::vector<double>> v26 = v45[5];
    v11.p1 = v17;
    v11.p0 = v5;
    v10 = v45;
    v45 = v1;
    const std::vector<std::vector<double>> v24 = v12[2];
    v12[4] = v2;
    v10[2] = v16;
    v11.p0 = v3;
    v12[0] = v2;
    v12[0] = v17;
    const std::vector<double> v35 = v42.p0;
    const std::vector<std::vector<double>> v43 = v45[4];
    v11.p0 = v23;
    const std::vector<std::vector<double>> v41 = v11.p1;
    const std::vector<std::vector<double>> v50 = v42.p1;
    v11.p0 = v5;
    std::vector<std::vector<double>> v74 = v17;
    s0 v32 = v42;
    v11.p0 = v23;
    const s0 v34(v35, v74);
    const std::vector<std::vector<double>> v48 = v11.p1;
    v11.p1 = v50;
    v10[5] = v43;
    v11.p1 = v41;
    v32.p1 = v19;
    const std::vector<s0> v37 { v11, v42, v34, v34, v34, v0, v0 };
    v32.p0 = v14;
    v10[4] = v26;
    const std::vector<std::vector<double>> v47 = v32.p1;
    v45[3] = v47;
    const s0 v85 = v37[3];
    const std::vector<double> v55 = v85.p0;
    std::vector<s0> v76 = v37;
    const std::vector<std::vector<double>> v49 = v42.p1;
    v11.p0 = v55;
    v32.p1 = v24;
    std::vector<s0> v160 = v76;
    v11.p1 = v49;
    v11.p1 = v48;
    const s0 v150 = v160[4];
    const std::vector<double> v62 = v150.p0;
    v11.p1 = v26;
    v76[6] = v11;
    const s0 v177(v62, v26);
    return v177;
  }
  s1 f79(const s1 &v0, const s0 &v1) {
    s1 v3 = v0;
    s1 v2 = v3;
    const std::vector<std::vector<s0>> v7 = v3.p0;
    const std::vector<s0> v21 { v1, v1 };
    const s0 v11 = f80(v1);
    const s0 v18 = v21[1];
    s1 v10 = v0;
    const std::vector<std::vector<s0>> v14 = v0.p0;
    const s0 v17 = f80(v11);
    const s0 v12 = f80(v17);
    v3 = v10;
    v3.p0 = v14;
    std::vector<s0> v20 = v21;
    v3.p1 = v18;
    v20[1] = v1;
    v2.p0 = v7;
    const std::vector<std::vector<s0>> v38 = v10.p0;
    const s0 v44 = f80(v12);
    v20[1] = v17;
    v2.p0 = v38;
    v2.p0 = v14;
    const s0 v53 = f80(v44);
    v20[0] = v17;
    v10.p0 = v14;
    const s0 v106 = v20[1];
    v10.p1 = v106;
    const s0 v133 = f80(v18);
    v2.p1 = v133;
    v20[1] = v53;
    v20[1] = v1;
    return v2;
  }
  std::vector<s0> f66(const std::vector<s0> &v0) {
    const s0 v6 = v0[0];
    const s0 v1 = f80(v6);
    std::vector<s0> v3 = v0;
    const s0 v5 = v3[0];
    const std::vector<std::vector<s0>> v11 { v0 };
    v3[0] = v6;
    v3[0] = v6;
    const s0 v7 = v3[0];
    const s0 v9 = f80(v1);
    const std::vector<std::vector<double>> v17 = v9.p1;
    const std::vector<double> v24 = v9.p0;
    const s0 v31 = f80(v5);
    const std::vector<s0> v20 = v11[0];
    v3[0] = v7;
    const s0 v18(v24, v17);
    std::vector<s0> v33 = v20;
    const s0 v68 = f80(v6);
    v33[0] = v18;
    v3[0] = v31;
    v33[0] = v31;
    v3[0] = v9;
    v33[0] = v68;
    v3[0] = v6;
    return v33;
  }
  s1 f65(const s1 &v0, const std::vector<s1> &v1) {
    const s1 v7 = v1[0];
    const s1 v2 = v1[0];
    s1 v9 = v7;
    const std::vector<std::vector<s0>> v13 = v2.p0;
    std::vector<std::vector<s0>> v15 = v13;
    std::vector<std::vector<s0>> v20 = v15;
    s1 v19 = v7;
    v19.p0 = v20;
    const std::vector<std::vector<s0>> v39 = v9.p0;
    const std::vector<s0> v30 = v13[0];
    const std::vector<s0> v38 = v39[2];
    const s0 v56 = v7.p1;
    const std::vector<s0> v18 = v39[2];
    const std::vector<s0> v33 = f66(v18);
    const s0 v29 = v30[0];
    v15[0] = v33;
    std::vector<std::vector<s0>> v27 = v15;
    v27[2] = v38;
    const std::vector<s0> v28 { v29, v56, v29, v29 };
    const s0 v86 = v28[0];
    const s0 v26 = v19.p1;
    v19.p0 = v20;
    v19.p0 = v27;
    std::vector<std::vector<s0>> v88 = v15;
    v9.p1 = v86;
    const std::vector<s0> v98 = f66(v33);
    const s1 v59(v88, v26);
    const s0 v72 = v18[0];
    v88[0] = v98;
    const s1 v69 = f79(v59, v72);
    return v69;
  }
  double f54(const s1 &v0, const double &v1, const double &v2) {
    return v2;
  }
  double f27(const double &v0) {
    const std::vector<double> v7 { v0, v0, v0, v0, v0, v0, v0 };
    std::vector<double> v6 = v7;
    const std::vector<double> v9 { v0, v0, v0, v0, v0 };
    std::vector<double> v8 = v9;
    const double v1 = v8[4];
    const double v5 = v6[3];
    const double v12 = v6[5];
    v6[2] = v0;
    const double v10 = v5 * v12;
    v6[4] = v10;
    v8[1] = v0;
    v6[3] = v1;
    return v10;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const s1 &v1, const double &v2) {
    const s0 v7 = v1.p1;
    const double v6 = f54(v1, v2, v2);
    std::vector<s1> v9 = v0;
    double v4 = v6;
    v9[0] = v1;
    double v34 = v2;
    double v17 = v34;
    const s1 v53 = f65(v1, v9);
    const s1 v19 = f65(v1, v0);
    const std::vector<std::vector<double>> v16 = v7.p1;
    std::vector<std::vector<double>> v38 = v16;
    v17 = v34;
    std::vector<s1> v57 = v0;
    const s1 v69 = f65(v19, v57);
    v57[0] = v69;
    const std::vector<double> v81 = v38[0];
    const double v54 = f27(v4);
    const double v146 = v17 / v54;
    const double v77 = v81[0];
    const double v106 = v77 + v34;
    const double v88 = f54(v53, v146, v34);
    v9[0] = v69;
    v4 = v6;
    const std::vector<double> v177 { v6, v88, v106, v77, v106 };
    const double v279 = v177[3];
    return v279;
  }
  int main() {
    std::vector<s1> v0({ { { { { { 0.0, 1.0 }, { { 2.0 }, { 3.0 } } } }, { { { 4.0, 5.0 }, { { 6.0 }, { 7.0 } } } }, { { { 8.0, 9.0 }, { { 10.0 }, { 11.0 } } } } }, { { 12.0, 13.0 }, { { 14.0 }, { 15.0 } } } } });
    s1 v1({ { { { { 16.0, 17.0 }, { { 18.0 }, { 19.0 } } } }, { { { 20.0, 21.0 }, { { 22.0 }, { 23.0 } } } }, { { { 24.0, 25.0 }, { { 26.0 }, { 27.0 } } } } }, { { 28.0, 29.0 }, { { 30.0 }, { 31.0 } } } });
    double v2(32.0);
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
