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
    s1(s0 v0): p0(v0) { }
  };
  struct s3 {
    std::vector<s1> p0;
    s0 p1;
    s3(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s3 p0;
    s1 p1;
    s7(s3 v0, s1 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s7> &v0, const double &v1) {
    const s7 v3 = v0[2];
    const s3 v2 = v3.p0;
    const s1 v5 = v3.p1;
    const s0 v6 = v5.p0;
    const s0 v10 = v2.p1;
    const std::vector<std::vector<double>> v15 = v10.p1;
    const std::vector<std::vector<double>> v24 = v6.p0;
    const std::vector<double> v59 = v24[1];
    std::vector<std::vector<double>> v23 = v15;
    const std::vector<double> v33 = v23[1];
    const double v28 = v33[0];
    v23[0] = v33;
    v23[1] = v59;
    double v48 = v28;
    v23[1] = v59;
    const double v135 = v28 + v48;
    return v135;
  }
  int main() {
    std::vector<s7> v0({ { { { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } } }, { { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } } }, { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } } }, { { { { { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } }, { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } } } }, { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } } }, { { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } } } }, { { { { { { { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } } } }, { { { { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } } }, { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 } } } }, { { { { 44.0 }, { 45.0 } }, { { 46.0 }, { 47.0 } } } } } });
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
