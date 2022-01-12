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
    std::vector<s0> p2;
    s0 p3;
    std::vector<s0> p4;
    s0 p5;
    s0 p6;
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1, std::vector<s0> v2, s0 v3, std::vector<s0> v4, s0 v5, s0 v6): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5), p6(v6) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<s1> p1;
    s2(std::vector<s0> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    s0 p1;
    s3(s2 v0, s0 v1): p0(v0), p1(v1) { }
  };
  s3 f47(const s3 &v0, const s3 &v1) {
    const s2 v4 = v0.p0;
    const std::vector<s0> v5 = v4.p0;
    s2 v7 = v4;
    const s0 v6 = v5[0];
    const std::vector<s0> v18 = v7.p0;
    v7.p0 = v18;
    v7.p0 = v5;
    const s3 v56(v7, v6);
    return v56;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    const s3 v5 = f47(v0, v0);
    double v2 = v1;
    const std::vector<s3> v7 { v5 };
    const s3 v3 = v7[0];
    const s2 v11 = v3.p0;
    s2 v32 = v11;
    const double v18 = v1 - v1;
    const std::vector<s1> v24 = v32.p1;
    const s1 v22 = v24[0];
    const std::vector<s0> v37 = v32.p0;
    const double v38 = v2 + v18;
    v32.p0 = v37;
    const s0 v43 = v22.p3;
    const std::vector<std::vector<double>> v63 = v43.p0;
    v32.p1 = v24;
    std::vector<s0> v42 = v37;
    const std::vector<double> v48 = v63[2];
    const double v36 = v48[0];
    v32.p0 = v42;
    const double v145 = v36 * v38;
    return v145;
  }
  int main() {
    s3 v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } } }, { { { { { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } } }, { { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } }, { { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } }, { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } } }, { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } } }, { { { { 35.0 }, { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } }, { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 } } } }, { { { 45.0 }, { 46.0 }, { 47.0 } }, { { 48.0 }, { 49.0 } } }, { { { 50.0 }, { 51.0 }, { 52.0 } }, { { 53.0 }, { 54.0 } } } } } }, { { { 55.0 }, { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } } });
    double v1(60.0);
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
