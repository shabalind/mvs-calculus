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
    s0 p1;
    s1(double v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s0 p0;
    std::vector<std::vector<s1>> p1;
    s4(s0 v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s4 p0;
    std::vector<s1> p1;
    s5(s4 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s0 p0;
    s5 p1;
    s6(s0 v0, s5 v1): p0(v0), p1(v1) { }
  };
  double f57(const double &v0) {
    double v7 = v0;
    double v6 = v7;
    double v4 = v7;
    double v5 = v0;
    v5 = v0;
    double v10 = v0;
    const std::vector<double> v13 { v7, v0, v10, v5 };
    const double v8 = v5 + v4;
    const double v9 = v13[0];
    const double v20 = v13[0];
    std::vector<double> v29 = v13;
    const std::vector<double> v17 { v10 };
    std::vector<double> v30 = v17;
    const double v15 = v29[2];
    std::vector<double> v21 = v29;
    v30[0] = v6;
    const double v27 = v13[1];
    double v37 = v9;
    v30[0] = v8;
    std::vector<double> v39 = v29;
    const double v45 = v21[0];
    double v35 = v0;
    v21[0] = v6;
    const double v46 = v39[0];
    std::vector<double> v61 = v13;
    std::vector<double> v26 = v13;
    const double v40 = v13[2];
    std::vector<double> v36 = v39;
    v26[0] = v37;
    const double v87 = v30[0];
    std::vector<double> v73 = v29;
    const double v56 = v40 - v87;
    v29[0] = v37;
    const std::vector<std::vector<double>> v72 { v61, v29, v26, v39, v13, v73 };
    const std::vector<std::vector<double>> v104 { v36 };
    std::vector<std::vector<double>> v147 = v72;
    std::vector<std::vector<double>> v55 = v104;
    v73[0] = v37;
    const std::vector<double> v161 = v147[1];
    const double v43 = v36[1];
    std::vector<std::vector<double>> v112 = v72;
    std::vector<std::vector<double>> v81 = v55;
    v36[0] = v43;
    v81[0] = v13;
    const std::vector<double> v75 = v112[3];
    const std::vector<double> v70 = v72[5];
    double v126 = v15;
    v36[1] = v126;
    v26[0] = v56;
    v147[0] = v70;
    const std::vector<double> v169 = v72[1];
    const std::vector<double> v106 = v81[0];
    v81[0] = v169;
    std::vector<double> v145 = v106;
    const double v230 = v145[3];
    v30[0] = v46;
    v147[0] = v75;
    v21[3] = v35;
    v81[0] = v161;
    v55[0] = v61;
    v36[0] = v27;
    v21[2] = v20;
    v39[0] = v45;
    v36[1] = v7;
    return v230;
  }
  double f3(const double &v0) {
    double v1 = v0;
    v1 = v0;
    double v6 = v1;
    const double v5 = f57(v1);
    double v4 = v0;
    const double v7 = f57(v5);
    const double v10 = f57(v7);
    const double v8 = v0 + v5;
    const double v15 = v7 / v0;
    const double v9 = f57(v7);
    double v11 = v7;
    const double v3 = f57(v15);
    double v19 = v15;
    double v14 = v4;
    const std::vector<double> v21 { v6, v6, v6, v3, v9, v0, v14 };
    std::vector<double> v16 = v21;
    v16[6] = v11;
    double v29 = v19;
    v16[6] = v29;
    v16[6] = v8;
    v1 = v14;
    v16[5] = v10;
    const double v32 = v16[4];
    return v32;
  }
  __attribute__((noinline))
  double f0(const std::vector<s4> &v0, const std::vector<s6> &v1, const double &v2) {
    const s6 v5 = v1[2];
    const s0 v10 = v5.p0;
    const std::vector<std::vector<double>> v4 = v10.p0;
    const std::vector<double> v9 = v4[0];
    const double v14 = v9[0];
    double v27 = v2;
    const double v57 = f3(v27);
    v27 = v14;
    return v57;
  }
  int main() {
    std::vector<s4> v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { 3.0, { { { 4.0 } }, { { 5.0 }, { 6.0 } } } } } } } });
    std::vector<s6> v1({ { { { { 7.0 } }, { { 8.0 }, { 9.0 } } }, { { { { { 10.0 } }, { { 11.0 }, { 12.0 } } }, { { { 13.0, { { { 14.0 } }, { { 15.0 }, { 16.0 } } } } } } }, { { 17.0, { { { 18.0 } }, { { 19.0 }, { 20.0 } } } }, { 21.0, { { { 22.0 } }, { { 23.0 }, { 24.0 } } } }, { 25.0, { { { 26.0 } }, { { 27.0 }, { 28.0 } } } } } } }, { { { { 29.0 } }, { { 30.0 }, { 31.0 } } }, { { { { { 32.0 } }, { { 33.0 }, { 34.0 } } }, { { { 35.0, { { { 36.0 } }, { { 37.0 }, { 38.0 } } } } } } }, { { 39.0, { { { 40.0 } }, { { 41.0 }, { 42.0 } } } }, { 43.0, { { { 44.0 } }, { { 45.0 }, { 46.0 } } } }, { 47.0, { { { 48.0 } }, { { 49.0 }, { 50.0 } } } } } } }, { { { { 51.0 } }, { { 52.0 }, { 53.0 } } }, { { { { { 54.0 } }, { { 55.0 }, { 56.0 } } }, { { { 57.0, { { { 58.0 } }, { { 59.0 }, { 60.0 } } } } } } }, { { 61.0, { { { 62.0 } }, { { 63.0 }, { 64.0 } } } }, { 65.0, { { { 66.0 } }, { { 67.0 }, { 68.0 } } } }, { 69.0, { { { 70.0 } }, { { 71.0 }, { 72.0 } } } } } } } });
    double v2(73.0);
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
