  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    double p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, double v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    s0 p1;
    s2(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s2 p0;
    std::vector<s1> p1;
    s4(s2 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  s0 f27(const s0 &v0) {
    const double v6 = v0.p1;
    const std::vector<std::vector<double>> v2 = v0.p0;
    const std::vector<double> v1 = v2[1];
    std::vector<std::vector<double>> v3 = v2;
    s0 v8 = v0;
    const std::vector<std::vector<double>> v4 = v8.p0;
    const double v11 = v1[0];
    s0 v7 = v0;
    std::vector<std::vector<double>> v16 = v2;
    v7.p0 = v16;
    std::vector<double> v13 = v1;
    v7 = v8;
    const std::vector<double> v30 = v2[1];
    std::vector<double> v15 = v13;
    v15 = v30;
    double v23 = v11;
    v13[0] = v23;
    s0 v19 = v8;
    v13[0] = v23;
    const std::vector<double> v9 = v3[0];
    v15[0] = v23;
    const double v12 = v7.p1;
    v3[1] = v1;
    v7.p0 = v16;
    v3[1] = v1;
    const std::vector<std::vector<double>> v21 = v0.p2;
    const std::vector<std::vector<double>> v14 = v7.p0;
    double v33 = v23;
    s0 v17 = v8;
    v8.p1 = v33;
    std::vector<std::vector<double>> v18 = v14;
    const std::vector<double> v22 = v16[0];
    std::vector<std::vector<double>> v37 = v21;
    std::vector<std::vector<double>> v20 = v16;
    std::vector<std::vector<double>> v42 = v21;
    v19.p2 = v37;
    double v45 = v6;
    v7.p2 = v21;
    const std::vector<double> v31 = v21[1];
    const s0 v25(v18, v12, v42);
    v15[0] = v45;
    v8.p0 = v4;
    const std::vector<std::vector<double>> v60 = v7.p0;
    const std::vector<std::vector<double>> v58 = v17.p2;
    const double v74 = v8.p1;
    std::vector<std::vector<double>> v39 = v58;
    const std::vector<double> v72 = v39[2];
    v20[1] = v9;
    std::vector<std::vector<double>> v57 = v16;
    const std::vector<double> v64 = v42[2];
    const s1 v48(v19, v25);
    v20[0] = v15;
    v19.p1 = v33;
    v19.p0 = v2;
    v37[2] = v64;
    s1 v55 = v48;
    v16[1] = v22;
    v55 = v48;
    std::vector<std::vector<double>> v56 = v57;
    double v101 = v74;
    v7.p2 = v39;
    v13[0] = v6;
    const s0 v79 = v55.p1;
    v13[0] = v12;
    v17.p0 = v60;
    v55.p1 = v25;
    const s0 v89 = v55.p1;
    v18[1] = v22;
    v39[0] = v15;
    std::vector<double> v238 = v31;
    v57[1] = v22;
    v13[0] = v101;
    v8.p1 = v23;
    v39[0] = v72;
    v7.p0 = v60;
    v57 = v20;
    v55.p0 = v89;
    v18 = v56;
    v20[0] = v30;
    v42[2] = v238;
    v18[0] = v1;
    v238[0] = v74;
    return v79;
  }
  s0 f22(const s0 &v0) {
    const double v5 = v0.p1;
    s0 v1 = v0;
    const std::vector<std::vector<double>> v2 = v1.p0;
    const s0 v8 = f27(v0);
    v1.p0 = v2;
    const s0 v6 = f27(v1);
    std::vector<std::vector<double>> v7 = v2;
    const double v10 = v0.p1;
    const std::vector<std::vector<double>> v3 = v1.p2;
    const s0 v11 = f27(v6);
    v1.p0 = v2;
    const std::vector<double> v14 = v7[1];
    v1.p2 = v3;
    std::vector<std::vector<double>> v13 = v7;
    const s0 v18 = f27(v1);
    v1.p2 = v3;
    v1.p2 = v3;
    const std::vector<double> v21 = v2[0];
    const std::vector<std::vector<double>> v15 = v11.p0;
    const s0 v20 = f27(v11);
    v1 = v8;
    v7[1] = v14;
    v13[0] = v14;
    v13[1] = v14;
    const std::vector<double> v36 = v3[0];
    const s0 v26 = f27(v8);
    const double v23 = v10 * v5;
    const std::vector<std::vector<double>> v35 = v11.p2;
    const std::vector<std::vector<std::vector<double>>> v24 { v15, v7, v13 };
    const double v29 = v21[0];
    const std::vector<std::vector<double>> v60 = v26.p0;
    const std::vector<std::vector<double>> v70 = v24[0];
    v7[0] = v36;
    v7[1] = v36;
    const s0 v50 = f27(v18);
    v1.p0 = v60;
    v1.p1 = v29;
    v1.p0 = v60;
    v1.p0 = v70;
    v1.p1 = v23;
    v1.p2 = v35;
    const double v51 = v50.p1;
    const std::vector<double> v96 = v15[1];
    v1.p0 = v60;
    v13[0] = v96;
    v1.p1 = v51;
    return v20;
  }
  s1 f4(const std::vector<s1> &v0, const s1 &v1) {
    const s1 v7 = v0[1];
    std::vector<s1> v3 = v0;
    const s1 v6 = v3[0];
    s1 v14 = v6;
    const s0 v9 = v14.p0;
    const s1 v5 = v0[0];
    const s0 v10 = v7.p1;
    s0 v12 = v10;
    const std::vector<std::vector<double>> v15 = v9.p0;
    const s0 v13 = f27(v10);
    const std::vector<std::vector<double>> v21 = v9.p0;
    const s1 v25 = v3[0];
    const s0 v20 = v25.p1;
    const std::vector<std::vector<double>> v29 = v12.p2;
    v14.p0 = v12;
    v12.p2 = v29;
    const double v31 = v9.p1;
    const s0 v58 = v7.p0;
    const std::vector<std::vector<double>> v64 = v12.p2;
    const double v39 = v31 + v31;
    const s0 v46(v21, v31, v64);
    v14.p1 = v13;
    const s1 v114(v46, v20);
    v14.p0 = v58;
    v12.p1 = v39;
    v14 = v5;
    v12.p0 = v15;
    return v114;
  }
  __attribute__((noinline))
  double f0(const s4 &v0, const double &v1) {
    const std::vector<s1> v9 = v0.p1;
    const s1 v3 = v9[1];
    const s1 v2 = f4(v9, v3);
    const s1 v5 = f4(v9, v2);
    double v10 = v1;
    const s0 v8 = v5.p1;
    s0 v14 = v8;
    v14.p1 = v1;
    const s0 v36 = f22(v14);
    double v20 = v10;
    const std::vector<std::vector<double>> v45 = v36.p0;
    std::vector<std::vector<double>> v47 = v45;
    v14.p1 = v20;
    const std::vector<double> v90 = v47[1];
    v14.p1 = v20;
    const double v91 = v90[0];
    const double v147 = v91 / v91;
    return v147;
  }
  int main() {
    s4 v0({ { { { { { { 0.0 }, { 1.0 } }, 2.0, { { 3.0 }, { 4.0 }, { 5.0 } } }, { { { 6.0 }, { 7.0 } }, 8.0, { { 9.0 }, { 10.0 }, { 11.0 } } } } }, { { { 12.0 }, { 13.0 } }, 14.0, { { 15.0 }, { 16.0 }, { 17.0 } } } }, { { { { { 18.0 }, { 19.0 } }, 20.0, { { 21.0 }, { 22.0 }, { 23.0 } } }, { { { 24.0 }, { 25.0 } }, 26.0, { { 27.0 }, { 28.0 }, { 29.0 } } } }, { { { { 30.0 }, { 31.0 } }, 32.0, { { 33.0 }, { 34.0 }, { 35.0 } } }, { { { 36.0 }, { 37.0 } }, 38.0, { { 39.0 }, { 40.0 }, { 41.0 } } } } } });
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
