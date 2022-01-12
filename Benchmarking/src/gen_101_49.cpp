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
    s1(std::vector<s0> v0): p0(v0) { }
  };
  struct s2 {
    std::vector<s1> p0;
    s1 p1;
    s2(std::vector<s1> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s2 p2;
    s3(s0 v0, std::vector<std::vector<s0>> v1, s2 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s4 {
    std::vector<std::vector<s3>> p0;
    std::vector<s3> p1;
    s4(std::vector<std::vector<s3>> v0, std::vector<s3> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s4 p0;
    s1 p1;
    s5(s4 v0, s1 v1): p0(v0), p1(v1) { }
  };
  double f3(const double &v0) {
    double v3 = v0;
    double v6 = v3;
    double v1 = v6;
    double v9 = v6;
    double v4 = v9;
    double v7 = v9;
    double v8 = v9;
    double v14 = v6;
    double v12 = v9;
    const double v10 = v4 * v7;
    double v2 = v7;
    double v5 = v12;
    const double v20 = v12 * v2;
    double v19 = v4;
    v7 = v20;
    double v13 = v8;
    double v25 = v8;
    const std::vector<double> v18 { v25, v0, v19, v10, v19, v5 };
    double v15 = v19;
    const double v24 = v15 - v7;
    v25 = v10;
    const double v23 = v18[4];
    v19 = v0;
    const double v22 = v1 + v1;
    std::vector<double> v30 = v18;
    v30[3] = v20;
    v30[4] = v24;
    const double v17 = v30[2];
    const double v21 = v30[4];
    double v65 = v19;
    v30[3] = v17;
    const std::vector<double> v47 { v14, v21, v23, v12 };
    std::vector<double> v54 = v47;
    std::vector<double> v76 = v47;
    const double v55 = v54[1];
    v5 = v65;
    const double v123 = v76[1];
    std::vector<double> v93 = v47;
    v30[5] = v123;
    const std::vector<std::vector<double>> v125 { v93, v47, v76, v76, v93, v54, v76 };
    std::vector<std::vector<double>> v120 = v125;
    double v85 = v20;
    v120[4] = v76;
    v76[2] = v23;
    const std::vector<double> v86 = v120[2];
    v120[6] = v86;
    const std::vector<double> v56 = v120[1];
    const double v91 = v56[0];
    v93[3] = v19;
    double v112 = v91;
    v30[1] = v85;
    v76[1] = v55;
    v120[4] = v86;
    v30[3] = v13;
    v9 = v22;
    return v112;
  }
  __attribute__((noinline))
  double f0(const std::vector<s5> &v0, const double &v1) {
    const double v21 = f3(v1);
    const double v180 = v1 / v21;
    double v146 = v180;
    const double v207 = v146 * v1;
    const double v116 = f3(v180);
    const double v295 = v116 / v207;
    return v295;
  }
  int main() {
    std::vector<s5> v0({ { { { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } }, { { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } } }, { { { { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } } } }, { { { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } } } }, { { { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } } } } } }, { { { { { 35.0 }, { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } } } } } } }, { { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 } } }, { { { { { 45.0 }, { 46.0 }, { 47.0 } }, { { 48.0 }, { 49.0 } } } }, { { { { 50.0 }, { 51.0 }, { 52.0 } }, { { 53.0 }, { 54.0 } } } }, { { { { 55.0 }, { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } } } }, { { { { { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 }, { 64.0 } } } } }, { { { { { 65.0 }, { 66.0 }, { 67.0 } }, { { 68.0 }, { 69.0 } } } } }, { { { { { 70.0 }, { 71.0 }, { 72.0 } }, { { 73.0 }, { 74.0 } } } } } }, { { { { { 75.0 }, { 76.0 }, { 77.0 } }, { { 78.0 }, { 79.0 } } } } } } } } }, { { { { { 80.0 }, { 81.0 }, { 82.0 } }, { { 83.0 }, { 84.0 } } } } } }, { { { { { { { { 85.0 }, { 86.0 }, { 87.0 } }, { { 88.0 }, { 89.0 } } }, { { { { { 90.0 }, { 91.0 }, { 92.0 } }, { { 93.0 }, { 94.0 } } } }, { { { { 95.0 }, { 96.0 }, { 97.0 } }, { { 98.0 }, { 99.0 } } } }, { { { { 100.0 }, { 101.0 }, { 102.0 } }, { { 103.0 }, { 104.0 } } } } }, { { { { { { { 105.0 }, { 106.0 }, { 107.0 } }, { { 108.0 }, { 109.0 } } } } }, { { { { { 110.0 }, { 111.0 }, { 112.0 } }, { { 113.0 }, { 114.0 } } } } }, { { { { { 115.0 }, { 116.0 }, { 117.0 } }, { { 118.0 }, { 119.0 } } } } } }, { { { { { 120.0 }, { 121.0 }, { 122.0 } }, { { 123.0 }, { 124.0 } } } } } } } } }, { { { { { 125.0 }, { 126.0 }, { 127.0 } }, { { 128.0 }, { 129.0 } } }, { { { { { 130.0 }, { 131.0 }, { 132.0 } }, { { 133.0 }, { 134.0 } } } }, { { { { 135.0 }, { 136.0 }, { 137.0 } }, { { 138.0 }, { 139.0 } } } }, { { { { 140.0 }, { 141.0 }, { 142.0 } }, { { 143.0 }, { 144.0 } } } } }, { { { { { { { 145.0 }, { 146.0 }, { 147.0 } }, { { 148.0 }, { 149.0 } } } } }, { { { { { 150.0 }, { 151.0 }, { 152.0 } }, { { 153.0 }, { 154.0 } } } } }, { { { { { 155.0 }, { 156.0 }, { 157.0 } }, { { 158.0 }, { 159.0 } } } } } }, { { { { { 160.0 }, { 161.0 }, { 162.0 } }, { { 163.0 }, { 164.0 } } } } } } } } }, { { { { { 165.0 }, { 166.0 }, { 167.0 } }, { { 168.0 }, { 169.0 } } } } } } });
    double v1(170.0);
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
