  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    double p0;
    std::vector<s0> p1;
    s1(double v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s3(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s3 p0;
    s0 p1;
    s5(s3 v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f44(const double &v0) {
    double v3 = v0;
    double v5 = v0;
    const std::vector<double> v2 { v3, v0 };
    std::vector<double> v9 = v2;
    const double v7 = v2[0];
    const double v4 = v2[0];
    const double v1 = v9[0];
    std::vector<double> v12 = v2;
    std::vector<double> v13 = v12;
    v9[0] = v3;
    v9[1] = v7;
    double v25 = v4;
    double v18 = v25;
    double v19 = v1;
    const std::vector<double> v40 { v25, v3, v0 };
    std::vector<double> v39 = v12;
    v39[1] = v5;
    const std::vector<std::vector<double>> v73 { v39, v9 };
    std::vector<double> v30 = v40;
    const double v44 = v40[1];
    v12[0] = v18;
    std::vector<double> v51 = v30;
    std::vector<double> v22 = v12;
    v12[1] = v44;
    std::vector<double> v49 = v51;
    const std::vector<double> v89 = v73[1];
    const std::vector<double> v98 = v73[1];
    std::vector<double> v69 = v13;
    v51[1] = v0;
    const double v82 = v69[0];
    const std::vector<double> v60 = v73[1];
    std::vector<double> v121 = v22;
    std::vector<double> v63 = v69;
    std::vector<double> v99 = v63;
    v121 = v39;
    std::vector<double> v132 = v121;
    const double v147 = v49[1];
    const double v117 = v51[0];
    v132[0] = v82;
    v30[2] = v147;
    v13[0] = v19;
    const std::vector<std::vector<double>> v92 { v132, v89, v60, v99, v98, v89, v99 };
    const std::vector<double> v138 = v92[6];
    v9[0] = v18;
    v132[0] = v117;
    const double v273 = v138[1];
    return v273;
  }
  double f18(const double &v0) {
    const double v2 = f44(v0);
    const double v10 = f44(v2);
    const double v12 = f44(v2);
    const std::vector<double> v30 { v0, v2, v10, v12, v0 };
    std::vector<double> v27 = v30;
    std::vector<double> v46 = v27;
    const double v86 = v46[0];
    return v86;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const s5 &v1, const s0 &v2, const s0 &v3, const double &v4) {
    const double v14 = v0.p0;
    const double v23 = v14 * v14;
    double v18 = v23;
    const double v35 = f18(v23);
    const std::vector<std::vector<double>> v16 = v3.p1;
    const std::vector<double> v34 = v16[0];
    std::vector<double> v28 = v34;
    const double v39 = f18(v18);
    v28[0] = v35;
    const double v33 = v28[0];
    v28 = v34;
    v28[0] = v39;
    return v33;
  }
  int main() {
    s1 v0({ 0.0, { { { { 1.0 }, { 2.0 }, { 3.0 } }, { { 4.0 } } }, { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 } } } } });
    s5 v1({ { { { { { { 9.0 }, { 10.0 }, { 11.0 } }, { { 12.0 } } } }, { { { { 13.0 }, { 14.0 }, { 15.0 } }, { { 16.0 } } } } }, { { { { 17.0 }, { 18.0 }, { 19.0 } }, { { 20.0 } } } } }, { { { 21.0 }, { 22.0 }, { 23.0 } }, { { 24.0 } } } });
    s0 v2({ { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 } } });
    s0 v3({ { { 29.0 }, { 30.0 }, { 31.0 } }, { { 32.0 } } });
    double v4(33.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
