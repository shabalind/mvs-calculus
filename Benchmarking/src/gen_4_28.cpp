  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<s0> p1;
    std::vector<std::vector<s0>> p2;
    s1(s0 v0, std::vector<s0> v1, std::vector<std::vector<s0>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s2 {
    s0 p0;
    std::vector<std::vector<s1>> p1;
    s2(s0 v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    s2 p1;
    s3(s2 v0, s2 v1): p0(v0), p1(v1) { }
  };
  double f46(const double &v0) {
    double v7 = v0;
    v7 = v0;
    double v1 = v0;
    const double v6 = v1 * v1;
    const double v3 = v1 + v7;
    double v4 = v3;
    double v10 = v1;
    double v13 = v10;
    double v9 = v6;
    v13 = v1;
    double v11 = v4;
    const double v24 = v0 + v13;
    const std::vector<double> v15 { v9 };
    const double v16 = v15[0];
    const double v29 = v15[0];
    std::vector<double> v39 = v15;
    v39[0] = v4;
    std::vector<double> v48 = v39;
    double v37 = v24;
    const double v38 = v48[0];
    v48[0] = v3;
    v4 = v37;
    v48[0] = v10;
    v48[0] = v29;
    const std::vector<double> v23 { v11, v16, v38 };
    const double v58 = v23[2];
    return v58;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    double v6 = v1;
    double v9 = v6;
    const double v8 = f46(v1);
    v6 = v8;
    double v50 = v9;
    const double v59 = v9 * v50;
    return v59;
  }
  int main() {
    s3 v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { { { { 3.0 }, { 4.0 } }, { { 5.0 } } }, { { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 } } } }, { { { { { 15.0 }, { 16.0 } }, { { 17.0 } } } }, { { { { 18.0 }, { 19.0 } }, { { 20.0 } } } }, { { { { 21.0 }, { 22.0 } }, { { 23.0 } } } } } } } } }, { { { { 24.0 }, { 25.0 } }, { { 26.0 } } }, { { { { { { 27.0 }, { 28.0 } }, { { 29.0 } } }, { { { { 30.0 }, { 31.0 } }, { { 32.0 } } }, { { { 33.0 }, { 34.0 } }, { { 35.0 } } }, { { { 36.0 }, { 37.0 } }, { { 38.0 } } } }, { { { { { 39.0 }, { 40.0 } }, { { 41.0 } } } }, { { { { 42.0 }, { 43.0 } }, { { 44.0 } } } }, { { { { 45.0 }, { 46.0 } }, { { 47.0 } } } } } } } } } });
    double v1(48.0);
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
