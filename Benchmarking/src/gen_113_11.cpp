  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f66(const double &v0) {
    double v5 = v0;
    double v6 = v0;
    double v7 = v6;
    double v3 = v0;
    double v9 = v0;
    double v13 = v3;
    double v8 = v9;
    const double v15 = v7 * v6;
    double v4 = v15;
    v5 = v4;
    const std::vector<double> v50 { v5 };
    double v53 = v0;
    double v23 = v13;
    v13 = v8;
    const double v34 = v50[0];
    const std::vector<double> v28 { v34, v7, v34, v23 };
    v53 = v5;
    std::vector<double> v64 = v28;
    v6 = v53;
    const double v74 = v64[1];
    const double v86 = v28[1];
    v64[3] = v0;
    const std::vector<double> v51 { v86, v74 };
    const double v26 = v51[0];
    std::vector<double> v56 = v51;
    std::vector<double> v90 = v56;
    std::vector<double> v92 = v90;
    v92[0] = v3;
    std::vector<double> v93 = v92;
    v92[1] = v7;
    v93 = v51;
    double v147 = v26;
    v93[0] = v147;
    const double v229 = v93[1];
    return v229;
  }
  double f11(const double &v0) {
    double v5 = v0;
    double v2 = v0;
    double v6 = v2;
    double v4 = v5;
    const double v8 = f66(v0);
    const double v1 = f66(v8);
    double v7 = v6;
    const double v3 = f66(v0);
    const double v10 = f66(v3);
    double v18 = v7;
    const double v12 = f66(v6);
    double v22 = v12;
    const std::vector<double> v14 { v22, v0, v7, v7, v12, v22 };
    std::vector<double> v17 = v14;
    double v28 = v18;
    const double v29 = v17[2];
    const double v42 = f66(v28);
    const double v25 = f66(v2);
    v5 = v10;
    std::vector<double> v30 = v17;
    double v21 = v8;
    const double v36 = v17[5];
    const double v39 = v17[2];
    v30[2] = v29;
    v17[5] = v42;
    double v49 = v28;
    const double v117 = v30[0];
    const double v101 = f66(v21);
    const double v40 = f66(v25);
    const double v54 = f66(v101);
    const std::vector<double> v71 { v4, v3, v1, v54, v39, v36, v7 };
    std::vector<double> v64 = v71;
    const double v152 = f66(v54);
    v64[6] = v117;
    v17[2] = v22;
    const double v111 = v64[2];
    v30[2] = v152;
    const double v157 = v40 / v111;
    v5 = v49;
    return v157;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const std::vector<s2> &v1, const double &v2) {
    const s0 v3 = v0.p0;
    const std::vector<std::vector<double>> v6 = v3.p0;
    const double v11 = f11(v2);
    const double v37 = f11(v2);
    const std::vector<double> v18 = v6[0];
    std::vector<double> v33 = v18;
    const double v9 = f66(v37);
    v33[0] = v11;
    const double v26 = f11(v9);
    const double v54 = f11(v26);
    const double v49 = f66(v37);
    const double v32 = v9 * v54;
    const double v122 = f66(v32);
    const double v86 = v33[0];
    const double v127 = f66(v49);
    const double v149 = v86 * v122;
    v33[0] = v127;
    return v149;
  }
  int main() {
    s2 v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } });
    std::vector<s2> v1({ { { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } }, { { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } }, { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } } }, { { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } }, { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } } } });
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
