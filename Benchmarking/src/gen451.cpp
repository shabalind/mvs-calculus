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
    std::vector<s0> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s0 f47(const s0 &v0) {
    const std::vector<std::vector<double>> v1 = v0.p0;
    const std::vector<double> v7 = v1[1];
    const std::vector<std::vector<double>> v3 = v0.p0;
    const std::vector<std::vector<double>> v4 = v0.p1;
    const std::vector<std::vector<double>> v2 = v0.p1;
    const std::vector<std::vector<double>> v18 = v0.p1;
    const s0 v9(v1, v4);
    const std::vector<std::vector<double>> v16 = v9.p1;
    s0 v14 = v9;
    const s0 v30(v3, v4);
    v14.p1 = v2;
    v14.p0 = v3;
    const std::vector<std::vector<double>> v35 = v9.p0;
    v14.p0 = v1;
    std::vector<std::vector<double>> v19 = v1;
    const std::vector<double> v69 = v19[0];
    const std::vector<std::vector<double>> v27 = v9.p0;
    v14.p1 = v18;
    v14.p0 = v19;
    s0 v36 = v30;
    s0 v45 = v30;
    const std::vector<std::vector<double>> v61 = v14.p1;
    v14.p0 = v27;
    const s0 v49(v1, v4);
    const std::vector<std::vector<double>> v54 = v36.p1;
    v14.p1 = v54;
    v19[2] = v69;
    v14.p1 = v2;
    v36 = v45;
    const std::vector<std::vector<double>> v60 = v14.p0;
    v14.p1 = v61;
    const std::vector<std::vector<double>> v43 = v49.p1;
    v19[1] = v7;
    const std::vector<std::vector<double>> v82 = v36.p1;
    v14.p1 = v61;
    const s0 v105(v60, v16);
    v14.p0 = v35;
    v45.p0 = v35;
    v45.p0 = v19;
    v36.p1 = v16;
    v45.p1 = v82;
    v14.p1 = v43;
    return v105;
  }
  s0 f35(const std::vector<s0> &v0, const s0 &v1) {
    const s0 v5 = v0[0];
    const s0 v6 = f47(v5);
    const s0 v4 = f47(v6);
    return v4;
  }
  s0 f27(const s0 &v0) {
    s0 v4 = v0;
    const std::vector<std::vector<double>> v3 = v0.p0;
    const std::vector<double> v5 = v3[0];
    const s0 v7 = f47(v4);
    std::vector<std::vector<double>> v6 = v3;
    std::vector<std::vector<double>> v14 = v6;
    v6[0] = v5;
    v4.p0 = v14;
    const std::vector<std::vector<double>> v12 = v4.p1;
    v14[1] = v5;
    v4.p1 = v12;
    const std::vector<double> v10 = v6[1];
    v6[1] = v10;
    const std::vector<std::vector<double>> v20 = v7.p1;
    v4.p1 = v20;
    std::vector<std::vector<double>> v11 = v6;
    std::vector<std::vector<double>> v23 = v20;
    v4.p1 = v12;
    std::vector<std::vector<double>> v47 = v23;
    const s0 v30 = f47(v4);
    const s0 v29 = f47(v30);
    std::vector<std::vector<double>> v86 = v11;
    v4.p1 = v47;
    v4.p1 = v20;
    std::vector<std::vector<double>> v21 = v86;
    v4.p0 = v21;
    const s0 v28 = f47(v29);
    v47[0] = v10;
    v4.p1 = v12;
    return v28;
  }
  s0 f20(const s0 &v0) {
    const std::vector<std::vector<double>> v7 = v0.p0;
    s0 v3 = v0;
    s0 v1 = v3;
    const s0 v2 = f47(v1);
    v1.p0 = v7;
    v1.p0 = v7;
    return v2;
  }
  s0 f9(const s0 &v0) {
    const s0 v5 = f47(v0);
    const std::vector<std::vector<double>> v2 = v5.p0;
    const std::vector<std::vector<double>> v1 = v0.p0;
    std::vector<std::vector<double>> v6 = v2;
    const std::vector<double> v7 = v6[2];
    v6[0] = v7;
    const double v9 = v7[0];
    const std::vector<std::vector<double>> v3 = v0.p1;
    const s0 v4 = f47(v0);
    v6[1] = v7;
    std::vector<std::vector<double>> v12 = v1;
    const std::vector<std::vector<double>> v11 = v5.p0;
    const s0 v8 = f27(v4);
    const std::vector<std::vector<double>> v15 = v8.p0;
    const s0 v10 = f20(v8);
    const s0 v14 = f47(v4);
    const s0 v13 = f20(v10);
    std::vector<double> v21 = v7;
    const std::vector<std::vector<double>> v25 = v4.p0;
    const s0 v30 = f20(v4);
    std::vector<std::vector<double>> v20 = v12;
    const std::vector<double> v23 = v11[1];
    const s0 v17 = f27(v13);
    const std::vector<double> v19 { v9, v9, v9, v9, v9 };
    const std::vector<double> v29 = v6[0];
    std::vector<std::vector<double>> v22 = v3;
    v6[0] = v23;
    const s0 v34 = f47(v30);
    std::vector<double> v24 = v19;
    v20 = v25;
    v20[1] = v23;
    double v60 = v9;
    const s0 v58 = f20(v5);
    std::vector<double> v33 = v19;
    v21[0] = v9;
    const double v28 = v19[2];
    std::vector<std::vector<double>> v48 = v3;
    const s0 v59 = f20(v34);
    const std::vector<double> v95 = v15[2];
    const double v73 = v60 * v60;
    const std::vector<std::vector<double>> v31 = v58.p0;
    std::vector<std::vector<double>> v42 = v22;
    std::vector<double> v26 = v33;
    v12[2] = v23;
    v33[3] = v28;
    v20 = v2;
    const std::vector<std::vector<double>> v61 = v14.p1;
    v26[0] = v60;
    const s0 v81 = f27(v17);
    const std::vector<double> v39 = v3[0];
    const std::vector<double> v55 = v3[0];
    v48[0] = v7;
    v60 = v28;
    v6[2] = v95;
    const std::vector<double> v72 = v20[0];
    v12[2] = v21;
    v21[0] = v28;
    const std::vector<double> v98 = v48[0];
    const double v63 = v24[3];
    std::vector<std::vector<double>> v64 = v61;
    const std::vector<std::vector<double>> v38 = v30.p0;
    double v41 = v63;
    v48[0] = v55;
    const std::vector<double> v66 = v31[2];
    std::vector<std::vector<double>> v86 = v38;
    v42[0] = v98;
    v64[0] = v66;
    std::vector<double> v108 = v26;
    v21[0] = v41;
    const s0 v121 = f20(v59);
    const std::vector<std::vector<double>> v143 = v81.p1;
    v48 = v143;
    s0 v83 = v121;
    v83.p0 = v31;
    v64[0] = v72;
    v83.p1 = v42;
    v24[1] = v73;
    v83.p0 = v20;
    v20 = v2;
    const std::vector<std::vector<double>> v196 = v8.p1;
    v64[0] = v39;
    v83.p1 = v196;
    v20[2] = v29;
    v83.p0 = v86;
    v83.p1 = v64;
    v24 = v108;
    const s0 v214 = f27(v83);
    return v214;
  }
  s0 f1(const s0 &v0) {
    const std::vector<std::vector<double>> v3 = v0.p0;
    const s0 v6 = f47(v0);
    const std::vector<std::vector<double>> v5 = v6.p1;
    std::vector<std::vector<double>> v8 = v3;
    const s0 v51(v8, v5);
    return v51;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const s1 &v1, const s0 &v2, const double &v3) {
    const std::vector<std::vector<s0>> v6 = v1.p0;
    s0 v4 = v2;
    const std::vector<std::vector<double>> v8 = v4.p0;
    const s0 v16 = f1(v2);
    const std::vector<double> v9 = v8[0];
    const std::vector<s0> v14 = v6[0];
    const std::vector<std::vector<double>> v29 = v16.p1;
    const s0 v18 = f35(v14, v2);
    const std::vector<std::vector<double>> v22 = v2.p1;
    v4.p1 = v29;
    const std::vector<std::vector<double>> v35 = v2.p0;
    const double v30 = v9[0];
    const s0 v59 = f9(v4);
    v4.p0 = v35;
    const std::vector<std::vector<double>> v20 = v18.p0;
    v4.p0 = v20;
    v4.p1 = v29;
    const std::vector<double> v36 = v22[0];
    const double v46 = v36[0];
    v4.p0 = v8;
    v4.p0 = v35;
    const double v70 = v3 - v30;
    v4 = v59;
    const double v106 = v46 - v70;
    return v106;
  }
  int main() {
    s1 v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } } } }, { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } } });
    s1 v1({ { { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } } }, { { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } } });
    s0 v2({ { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } });
    double v3(28.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
