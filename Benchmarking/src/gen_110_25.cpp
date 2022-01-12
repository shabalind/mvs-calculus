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
    s0 p1;
    s0 p2;
    std::vector<s0> p3;
    std::vector<s0> p4;
    s0 p5;
    std::vector<s0> p6;
    s0 p7;
    s1(s0 v0, s0 v1, s0 v2, std::vector<s0> v3, std::vector<s0> v4, s0 v5, std::vector<s0> v6, s0 v7): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5), p6(v6), p7(v7) { }
  };
  struct s2 {
    std::vector<s1> p0;
    std::vector<std::vector<s1>> p1;
    s2(std::vector<s1> v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    std::vector<s2> p1;
    s3(s0 v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const double &v1) {
    double v4 = v1;
    const s3 v2 = v0[0];
    const s0 v3 = v2.p0;
    const std::vector<std::vector<double>> v8 = v3.p1;
    const std::vector<double> v13 = v8[0];
    const std::vector<std::vector<double>> v14 = v3.p1;
    std::vector<double> v33 = v13;
    const double v40 = v33[0];
    double v146 = v4;
    v33[0] = v4;
    const std::vector<double> v34 = v14[1];
    v33[0] = v146;
    const double v128 = v1 - v40;
    v33 = v34;
    return v128;
  }
  int main() {
    std::vector<s3> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { { { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } }, { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } }, { { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } }, { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } } }, { { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } } }, { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } }, { { { { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } } } }, { { { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } } }, { { { { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 } } }, { { { 44.0 }, { 45.0 } }, { { 46.0 }, { 47.0 } } }, { { { 48.0 }, { 49.0 } }, { { 50.0 }, { 51.0 } } }, { { { { 52.0 }, { 53.0 } }, { { 54.0 }, { 55.0 } } }, { { { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } } }, { { { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 } } } }, { { { 64.0 }, { 65.0 } }, { { 66.0 }, { 67.0 } } }, { { { { 68.0 }, { 69.0 } }, { { 70.0 }, { 71.0 } } } }, { { { 72.0 }, { 73.0 } }, { { 74.0 }, { 75.0 } } } } }, { { { { { 76.0 }, { 77.0 } }, { { 78.0 }, { 79.0 } } }, { { { 80.0 }, { 81.0 } }, { { 82.0 }, { 83.0 } } }, { { { 84.0 }, { 85.0 } }, { { 86.0 }, { 87.0 } } }, { { { { 88.0 }, { 89.0 } }, { { 90.0 }, { 91.0 } } }, { { { 92.0 }, { 93.0 } }, { { 94.0 }, { 95.0 } } } }, { { { { 96.0 }, { 97.0 } }, { { 98.0 }, { 99.0 } } } }, { { { 100.0 }, { 101.0 } }, { { 102.0 }, { 103.0 } } }, { { { { 104.0 }, { 105.0 } }, { { 106.0 }, { 107.0 } } } }, { { { 108.0 }, { 109.0 } }, { { 110.0 }, { 111.0 } } } } }, { { { { { 112.0 }, { 113.0 } }, { { 114.0 }, { 115.0 } } }, { { { 116.0 }, { 117.0 } }, { { 118.0 }, { 119.0 } } }, { { { 120.0 }, { 121.0 } }, { { 122.0 }, { 123.0 } } }, { { { { 124.0 }, { 125.0 } }, { { 126.0 }, { 127.0 } } }, { { { 128.0 }, { 129.0 } }, { { 130.0 }, { 131.0 } } } }, { { { { 132.0 }, { 133.0 } }, { { 134.0 }, { 135.0 } } } }, { { { 136.0 }, { 137.0 } }, { { 138.0 }, { 139.0 } } }, { { { { 140.0 }, { 141.0 } }, { { 142.0 }, { 143.0 } } } }, { { { 144.0 }, { 145.0 } }, { { 146.0 }, { 147.0 } } } } } } } } } });
    double v1(148.0);
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
