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
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<std::vector<s1>> p0;
    std::vector<s0> p1;
    s3(std::vector<std::vector<s1>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    s0 p0;
    std::vector<s3> p1;
    s8(s0 v0, std::vector<s3> v1): p0(v0), p1(v1) { }
  };
  s0 f21(const s0 &v0) {
    const std::vector<std::vector<double>> v7 = v0.p0;
    const std::vector<std::vector<double>> v2 = v0.p1;
    const s0 v23(v7, v2);
    return v23;
  }
  __attribute__((noinline))
  double f0(const s8 &v0, const double &v1) {
    const s0 v4 = v0.p0;
    s0 v13 = v4;
    const s0 v7 = f21(v4);
    const std::vector<std::vector<double>> v5 = v13.p1;
    const s0 v10 = f21(v7);
    v13 = v10;
    const std::vector<std::vector<std::vector<double>>> v15 { v5, v5, v5, v5 };
    const std::vector<std::vector<double>> v42 = v15[2];
    const std::vector<std::vector<double>> v26 = v10.p0;
    const std::vector<double> v36 = v42[1];
    v13.p0 = v26;
    std::vector<double> v19 = v36;
    const std::vector<std::vector<double>> v61 = v4.p0;
    v13.p1 = v5;
    v13.p0 = v61;
    v13.p1 = v42;
    const double v158 = v19[0];
    return v158;
  }
  int main() {
    s8 v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { { { { { { { 3.0 } }, { { 4.0 }, { 5.0 } } } }, { { { { 6.0 } }, { { 7.0 }, { 8.0 } } }, { { { 9.0 } }, { { 10.0 }, { 11.0 } } } } } } }, { { { { 12.0 } }, { { 13.0 }, { 14.0 } } }, { { { 15.0 } }, { { 16.0 }, { 17.0 } } } } }, { { { { { { { { 18.0 } }, { { 19.0 }, { 20.0 } } } }, { { { { 21.0 } }, { { 22.0 }, { 23.0 } } }, { { { 24.0 } }, { { 25.0 }, { 26.0 } } } } } } }, { { { { 27.0 } }, { { 28.0 }, { 29.0 } } }, { { { 30.0 } }, { { 31.0 }, { 32.0 } } } } } } });
    double v1(33.0);
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
