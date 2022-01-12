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
    std::vector<std::vector<s0>> p1;
    s1(std::vector<s0> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  double f17(const double &v0) {
    double v5 = v0;
    double v6 = v0;
    v5 = v6;
    double v3 = v5;
    double v1 = v3;
    const std::vector<double> v2 { v1 };
    v5 = v3;
    const double v4 = v2[0];
    const std::vector<double> v10 { v3, v4, v3, v4, v4, v3 };
    const double v9 = v2[0];
    const double v17 = v2[0];
    const double v16 = v10[4];
    const double v28 = v10[5];
    const std::vector<double> v41 { v16, v4 };
    std::vector<double> v26 = v41;
    const double v48 = v26[0];
    v26[1] = v17;
    const std::vector<double> v22 { v48, v9, v5, v16, v1, v1, v4 };
    std::vector<double> v29 = v22;
    const double v33 = v29[2];
    std::vector<double> v53 = v10;
    v53[3] = v33;
    const std::vector<std::vector<double>> v124 { v10 };
    std::vector<std::vector<double>> v63 = v124;
    v26[1] = v28;
    v53[4] = v28;
    std::vector<std::vector<double>> v88 = v63;
    std::vector<std::vector<double>> v45 = v88;
    const std::vector<double> v80 = v45[0];
    std::vector<double> v169 = v80;
    const std::vector<double> v123 = v88[0];
    v63[0] = v123;
    v88[0] = v53;
    const double v203 = v169[0];
    return v203;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const s1 &v1, const s0 &v2, const double &v3) {
    double v6 = v3;
    const std::vector<std::vector<double>> v11 = v2.p0;
    const std::vector<double> v13 = v11[0];
    const double v10 = f17(v6);
    const double v41 = v13[0];
    double v34 = v10;
    const std::vector<double> v81 = v11[2];
    const double v51 = v81[0];
    const double v107 = v13[0];
    const double v114 = v41 + v34;
    const std::vector<double> v164 { v107, v3, v114, v10, v51, v107 };
    const double v104 = v164[1];
    return v104;
  }
  int main() {
    std::vector<s1> v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } } }, { { { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } } } }, { { { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } }, { { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } } }, { { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } } } } } });
    s1 v1({ { { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } } } }, { { { { { 35.0 }, { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } }, { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 } } } } } });
    s0 v2({ { { 45.0 }, { 46.0 }, { 47.0 } }, { { 48.0 }, { 49.0 } } });
    double v3(50.0);
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
