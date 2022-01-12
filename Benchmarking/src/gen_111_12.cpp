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
    s1 p0;
    s0 p1;
    s2(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s1> p0;
    std::vector<std::vector<s0>> p1;
    s3(std::vector<s1> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const std::vector<s3> &v1, const s2 &v2, const double &v3) {
    const s1 v6 = v2.p0;
    const std::vector<s0> v8 = v6.p0;
    s2 v21 = v2;
    v21.p0 = v6;
    const s0 v25 = v8[0];
    v21.p1 = v25;
    s0 v18 = v25;
    v21.p0 = v6;
    v21.p0 = v6;
    s0 v29 = v25;
    v21.p1 = v18;
    s0 v20 = v25;
    const s0 v36 = v2.p1;
    v21.p1 = v20;
    v21.p1 = v29;
    const std::vector<std::vector<double>> v38 = v36.p1;
    const s0 v69 = v21.p1;
    const std::vector<std::vector<double>> v70 = v36.p1;
    v20.p1 = v38;
    const std::vector<std::vector<double>> v86 = v69.p1;
    const std::vector<double> v93 = v86[0];
    v18.p1 = v70;
    const double v116 = v93[0];
    return v116;
  }
  int main() {
    std::vector<s2> v0({ { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } } });
    std::vector<s3> v1({ { { { { { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } }, { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } } } }, { { { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } } } } } });
    s2 v2({ { { { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 } } }, { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } } }, { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } } }, { { { 44.0 }, { 45.0 }, { 46.0 } }, { { 47.0 } } } });
    double v3(48.0);
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
