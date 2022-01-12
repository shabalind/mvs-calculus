  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    std::vector<std::vector<s0>> p1;
    s2(std::vector<s1> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  s1 f56(const s1 &v0) {
    s1 v7 = v0;
    s1 v1 = v0;
    const std::vector<s0> v2 = v1.p0;
    const s0 v3 = v2[0];
    const std::vector<std::vector<double>> v5 = v3.p1;
    const std::vector<s0> v4 = v7.p0;
    v1.p1 = v3;
    v7 = v0;
    const s1 v10(v4, v3);
    const std::vector<std::vector<s0>> v12 { v2, v4, v4, v2, v4, v2, v4 };
    s1 v9 = v10;
    std::vector<std::vector<s0>> v11 = v12;
    const s0 v20 = v10.p1;
    v7.p1 = v20;
    v11[4] = v2;
    std::vector<s0> v13 = v4;
    const s0 v27 = v2[0];
    std::vector<std::vector<s0>> v26 = v11;
    const s1 v35(v13, v27);
    s0 v25 = v20;
    const std::vector<s0> v28 = v9.p0;
    v9.p1 = v25;
    const std::vector<s0> v44 = v26[6];
    const s1 v17(v44, v3);
    std::vector<std::vector<double>> v23 = v5;
    v7.p0 = v28;
    const std::vector<s0> v41 = v7.p0;
    v1 = v35;
    v25.p1 = v23;
    v26[0] = v44;
    v9.p0 = v41;
    v11[6] = v4;
    return v17;
  }
  s2 f50(const s2 &v0) {
    const std::vector<s1> v8 = v0.p0;
    s2 v5 = v0;
    v5 = v0;
    const std::vector<s1> v16 = v0.p0;
    const std::vector<std::vector<s1>> v28 { v16, v8, v8 };
    v5.p0 = v8;
    const std::vector<s1> v23 = v28[2];
    v5 = v0;
    s2 v33 = v5;
    s2 v29 = v5;
    const std::vector<s1> v44 = v29.p0;
    s2 v134 = v33;
    std::vector<s1> v77 = v44;
    v134.p0 = v77;
    s2 v76 = v134;
    v76.p0 = v23;
    return v76;
  }
  s2 f49(const s2 &v0) {
    s2 v3 = v0;
    s2 v5 = v3;
    const std::vector<std::vector<s0>> v7 = v3.p1;
    const s2 v18 = f50(v5);
    const s2 v20 = f50(v18);
    v3.p1 = v7;
    return v20;
  }
  s2 f41(const s2 &v0) {
    const s2 v8 = f49(v0);
    const s2 v9 = f49(v8);
    const s2 v12 = f50(v9);
    const std::vector<s1> v11 = v9.p0;
    s2 v19 = v12;
    const s2 v23 = f50(v19);
    v19.p0 = v11;
    const s2 v22 = f49(v23);
    v19.p0 = v11;
    return v22;
  }
  s0 f27(const s0 &v0) {
    s0 v7 = v0;
    const std::vector<std::vector<double>> v2 = v0.p0;
    const std::vector<double> v6 = v2[2];
    const std::vector<std::vector<double>> v5 = v7.p1;
    std::vector<std::vector<double>> v4 = v2;
    v7.p0 = v2;
    std::vector<std::vector<double>> v1 = v5;
    const std::vector<std::vector<double>> v3 = v7.p1;
    std::vector<double> v8 = v6;
    const std::vector<std::vector<double>> v13 = v7.p0;
    v4[2] = v6;
    std::vector<std::vector<double>> v9 = v5;
    s0 v11 = v0;
    v9[0] = v6;
    std::vector<std::vector<double>> v20 = v2;
    v7.p1 = v3;
    const std::vector<double> v22 = v3[1];
    std::vector<std::vector<double>> v36 = v1;
    const double v12 = v6[0];
    const std::vector<double> v42 = v3[1];
    const std::vector<std::vector<double>> v29 = v11.p0;
    const std::vector<double> v21 = v1[1];
    const std::vector<std::vector<double>> v70 = v7.p0;
    const std::vector<std::vector<double>> v14 = v0.p1;
    const std::vector<double> v25 = v5[1];
    v11 = v7;
    const std::vector<std::vector<double>> v17 = v0.p1;
    const std::vector<std::vector<double>> v10 = v11.p0;
    const s0 v43(v70, v36);
    v9[1] = v8;
    v7.p1 = v36;
    s0 v16 = v43;
    std::vector<std::vector<double>> v24 = v13;
    v8[0] = v12;
    v1[1] = v22;
    v11.p0 = v2;
    const std::vector<std::vector<double>> v48 = v16.p1;
    v11.p0 = v4;
    v7.p1 = v48;
    std::vector<std::vector<double>> v26 = v17;
    const std::vector<double> v34 = v14[0];
    v16.p1 = v3;
    v8[0] = v12;
    v7.p1 = v36;
    const std::vector<double> v51 = v29[2];
    const std::vector<std::vector<double>> v45 = v11.p0;
    v1 = v48;
    v16.p1 = v26;
    const double v40 = v6[0];
    const std::vector<std::vector<double>> v28 { v25, v21 };
    const std::vector<std::vector<double>> v31 = v43.p1;
    const std::vector<double> v96 = v10[0];
    const std::vector<std::vector<double>> v27 = v16.p1;
    const std::vector<double> v46 = v28[0];
    v11.p0 = v29;
    v7.p0 = v20;
    std::vector<double> v50 = v46;
    const std::vector<double> v85 = v4[1];
    std::vector<std::vector<double>> v79 = v29;
    v79[1] = v50;
    const std::vector<double> v91 = v31[1];
    std::vector<std::vector<double>> v39 = v45;
    v9[1] = v51;
    std::vector<std::vector<double>> v86 = v24;
    v11.p1 = v48;
    v11.p0 = v39;
    std::vector<double> v100 = v91;
    double v116 = v40;
    std::vector<double> v77 = v85;
    v11.p1 = v3;
    v86[2] = v100;
    double v47 = v116;
    std::vector<double> v117 = v96;
    v1[1] = v42;
    v11.p1 = v9;
    std::vector<double> v66 = v34;
    double v122 = v116;
    const double v97 = v66[0];
    v122 = v116;
    v77[0] = v47;
    v117[0] = v116;
    v16.p1 = v27;
    v11.p1 = v1;
    std::vector<std::vector<double>> v62 = v2;
    v79[0] = v77;
    const double v125 = v25[0];
    v7.p0 = v29;
    v9[1] = v117;
    const std::vector<double> v69 { v122, v125 };
    v79[2] = v21;
    const double v56 = v69[1];
    v77[0] = v97;
    v16.p0 = v45;
    const double v52 = v69[0];
    v7.p0 = v62;
    v62[0] = v25;
    v47 = v52;
    const std::vector<std::vector<double>> v184 = v16.p1;
    s0 v142 = v7;
    v26[1] = v77;
    v4[1] = v85;
    v100[0] = v56;
    const std::vector<std::vector<double>> v133 = v142.p0;
    const std::vector<double> v175 = v184[1];
    v7.p0 = v79;
    v39[2] = v175;
    v11.p0 = v86;
    v11.p1 = v1;
    v16.p0 = v133;
    return v11;
  }
  s2 f26(const s2 &v0) {
    s2 v5 = v0;
    v5 = v0;
    const s2 v7 = f49(v5);
    s2 v8 = v7;
    const std::vector<s1> v4 = v7.p0;
    const s2 v10 = f41(v8);
    v8.p0 = v4;
    return v10;
  }
  s1 f19(const s1 &v0) {
    const s1 v7 = f56(v0);
    return v7;
  }
  s2 f17(const s2 &v0) {
    const std::vector<s2> v5 { v0, v0, v0, v0, v0, v0 };
    const s2 v6 = f50(v0);
    const s2 v2 = v5[4];
    const s2 v7 = f41(v2);
    std::vector<s2> v8 = v5;
    const s2 v1 = f26(v2);
    std::vector<s2> v21 = v8;
    v21[0] = v7;
    v21[1] = v6;
    v21[0] = v7;
    const s2 v45 = v8[5];
    v21[5] = v45;
    const s2 v101 = v21[1];
    v21[1] = v1;
    const s2 v130 = f41(v7);
    v8[1] = v130;
    return v101;
  }
  s1 f12(const s1 &v0, const s2 &v1) {
    const std::vector<s1> v4 { v0 };
    const s0 v6 = v0.p1;
    const s1 v3 = v4[0];
    const s0 v8 = f27(v6);
    const s0 v7 = f27(v6);
    const std::vector<std::vector<s0>> v5 = v1.p1;
    const std::vector<s0> v9 = v5[0];
    std::vector<s1> v12 = v4;
    const s1 v20 = f19(v0);
    v12[0] = v3;
    const s1 v11 = v12[0];
    v12 = v4;
    std::vector<s0> v30 = v9;
    s1 v35 = v11;
    const s0 v15 = f27(v7);
    const std::vector<s0> v18 = v0.p0;
    std::vector<s0> v83 = v30;
    const s1 v34(v18, v15);
    const std::vector<s1> v25 { v34, v35, v35, v20, v0, v0 };
    const s1 v22(v83, v8);
    v83 = v30;
    const s1 v41 = f19(v0);
    v12[0] = v11;
    const s1 v69 = v25[5];
    v12[0] = v41;
    v30[0] = v15;
    const s0 v48 = f27(v7);
    v83[0] = v48;
    const s0 v171 = v34.p1;
    v35.p1 = v48;
    v12[0] = v22;
    v83[0] = v171;
    return v69;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const s2 &v1, const double &v2) {
    const s2 v7 = f17(v1);
    const s2 v11 = f26(v7);
    const s1 v19 = f12(v0, v11);
    const s1 v20 = f12(v19, v7);
    const std::vector<s0> v34 = v20.p0;
    const s0 v21 = v34[0];
    const std::vector<std::vector<double>> v42 = v21.p0;
    const std::vector<double> v45 = v42[1];
    std::vector<double> v96 = v45;
    const double v74 = v45[0];
    const double v61 = v96[0];
    v96[0] = v74;
    v96[0] = v61;
    return v61;
  }
  int main() {
    s1 v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } } }, { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } });
    s2 v1({ { { { { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } }, { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } }, { { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } } }, { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } } } }, { { { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } } } }, { { { { 35.0 }, { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } } } });
    double v2(40.0);
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
