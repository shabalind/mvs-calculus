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
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<s0>> p1;
    s2(std::vector<std::vector<double>> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<std::vector<s0>> p0;
    std::vector<std::vector<s1>> p1;
    s3(std::vector<std::vector<s0>> v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s0 p0;
    s1 p1;
    s4(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s3> p0;
    s1 p1;
    std::vector<std::vector<s0>> p2;
    s5(std::vector<s3> v0, s1 v1, std::vector<std::vector<s0>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s6 {
    std::vector<std::vector<s0>> p0;
    std::vector<s4> p1;
    s0 p2;
    s6(std::vector<std::vector<s0>> v0, std::vector<s4> v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s10 {
    s5 p0;
    s6 p1;
    s10(s5 v0, s6 v1): p0(v0), p1(v1) { }
  };
  s2 f6(const s2 &v0) {
    s2 v6 = v0;
    s2 v3 = v0;
    s2 v1 = v6;
    const std::vector<std::vector<s0>> v5 = v3.p1;
    v1.p1 = v5;
    v1 = v0;
    const std::vector<std::vector<double>> v4 = v1.p0;
    std::vector<std::vector<double>> v10 = v4;
    const std::vector<double> v38 = v4[1];
    v10[0] = v38;
    s2 v11 = v0;
    const std::vector<std::vector<s0>> v24 = v0.p1;
    const std::vector<std::vector<s0>> v15 = v3.p1;
    std::vector<std::vector<double>> v14 = v4;
    v11.p0 = v14;
    v14[1] = v38;
    const std::vector<std::vector<double>> v20 = v11.p0;
    v6.p0 = v20;
    v1.p0 = v14;
    v1.p0 = v10;
    s2 v22 = v11;
    v22.p1 = v15;
    v22.p1 = v24;
    return v22;
  }
  __attribute__((noinline))
  double f0(const s10 &v0, const std::vector<s2> &v1, const double &v2) {
    std::vector<s2> v7 = v1;
    v7 = v1;
    double v5 = v2;
    v7 = v1;
    const s2 v4 = v7[0];
    std::vector<s2> v17 = v7;
    const s2 v10 = f6(v4);
    const s2 v11 = f6(v4);
    v17[0] = v11;
    const s2 v14 = f6(v10);
    const std::vector<std::vector<double>> v62 = v4.p0;
    const double v40 = v5 + v5;
    v7 = v17;
    const s2 v46 = v17[0];
    const s2 v39 = f6(v10);
    const double v24 = v5 - v40;
    v17[0] = v46;
    const std::vector<double> v31 = v62[0];
    const double v43 = v31[0];
    const s2 v79 = f6(v11);
    v17[0] = v39;
    const std::vector<s2> v48 { v4, v11, v39, v14, v79 };
    const s2 v44 = f6(v79);
    const double v63 = v31[0];
    const double v42 = v63 / v43;
    std::vector<s2> v61 = v48;
    const double v161 = v63 / v24;
    v61[2] = v46;
    const s2 v174 = v61[4];
    const double v172 = v40 * v42;
    v7[0] = v10;
    v61[1] = v10;
    v61[3] = v79;
    const double v173 = v161 * v172;
    v17[0] = v174;
    v7[0] = v44;
    return v173;
  }
  int main() {
    s10 v0({ { { { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } } }, { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } } }, { { { { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } } }, { { { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } } } } }, { { { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } } }, { { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } } } }, { { { { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 } } }, { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } } } }, { { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } }, { { { 44.0 }, { 45.0 }, { 46.0 } }, { { 47.0 } } } } } } }, { { { { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 } } } }, { { { { 52.0 }, { 53.0 }, { 54.0 } }, { { 55.0 } } } } }, { { { { { { 56.0 }, { 57.0 }, { 58.0 } }, { { 59.0 } } }, { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 } } } } }, { { { { { 64.0 }, { 65.0 }, { 66.0 } }, { { 67.0 } } }, { { { 68.0 }, { 69.0 }, { 70.0 } }, { { 71.0 } } } } } } } }, { { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 } } }, { { { 76.0 }, { 77.0 }, { 78.0 } }, { { 79.0 } } } }, { { { { { 80.0 }, { 81.0 }, { 82.0 } }, { { 83.0 } } } } } }, { { { { { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 } } } }, { { { { 88.0 }, { 89.0 }, { 90.0 } }, { { 91.0 } } } }, { { { { 92.0 }, { 93.0 }, { 94.0 } }, { { 95.0 } } } } }, { { { { { 96.0 }, { 97.0 }, { 98.0 } }, { { 99.0 } } }, { { { { 100.0 }, { 101.0 }, { 102.0 } }, { { 103.0 } } }, { { { 104.0 }, { 105.0 }, { 106.0 } }, { { 107.0 } } } } }, { { { { 108.0 }, { 109.0 }, { 110.0 } }, { { 111.0 } } }, { { { { 112.0 }, { 113.0 }, { 114.0 } }, { { 115.0 } } }, { { { 116.0 }, { 117.0 }, { 118.0 } }, { { 119.0 } } } } }, { { { { 120.0 }, { 121.0 }, { 122.0 } }, { { 123.0 } } }, { { { { 124.0 }, { 125.0 }, { 126.0 } }, { { 127.0 } } }, { { { 128.0 }, { 129.0 }, { 130.0 } }, { { 131.0 } } } } } }, { { { 132.0 }, { 133.0 }, { 134.0 } }, { { 135.0 } } } } });
    std::vector<s2> v1({ { { { 136.0 }, { 137.0 }, { 138.0 } }, { { { { { 139.0 }, { 140.0 }, { 141.0 } }, { { 142.0 } } } } } } });
    double v2(143.0);
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
