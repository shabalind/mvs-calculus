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
  struct s3 {
    s0 p0;
    s1 p1;
    s3(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<std::vector<s1>> p0;
    std::vector<s3> p1;
    s4(std::vector<std::vector<s1>> v0, std::vector<s3> v1): p0(v0), p1(v1) { }
  };
  struct s9 {
    std::vector<s1> p0;
    std::vector<std::vector<s0>> p1;
    s9(std::vector<s1> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s11 {
    s4 p0;
    std::vector<s9> p1;
    s11(s4 v0, std::vector<s9> v1): p0(v0), p1(v1) { }
  };
  s11 f13(const s11 &v0) {
    const s4 v6 = v0.p0;
    s4 v4 = v6;
    const std::vector<s4> v11 { v6, v6 };
    const s4 v14 = v11[0];
    s11 v26 = v0;
    v26.p0 = v14;
    const s4 v41 = v11[0];
    s11 v29 = v26;
    v29.p0 = v4;
    const s4 v22 = v11[1];
    const s4 v84 = v11[0];
    v29.p0 = v84;
    v26.p0 = v41;
    const std::vector<s3> v66 = v41.p1;
    v29.p0 = v22;
    v26.p0 = v6;
    v4.p1 = v66;
    return v29;
  }
  s4 f3(const s4 &v0) {
    const std::vector<std::vector<s1>> v7 = v0.p0;
    s4 v6 = v0;
    const std::vector<s3> v2 = v6.p1;
    v6.p1 = v2;
    std::vector<std::vector<s1>> v8 = v7;
    const std::vector<std::vector<s1>> v1 = v0.p0;
    const std::vector<std::vector<s1>> v4 = v6.p0;
    v6.p0 = v4;
    v6.p0 = v8;
    const std::vector<s1> v10 = v1[2];
    v6.p0 = v1;
    v8[1] = v10;
    s4 v36 = v6;
    const std::vector<s3> v59 = v0.p1;
    const std::vector<std::vector<s1>> v58 = v36.p0;
    v6.p0 = v58;
    v6.p1 = v59;
    return v36;
  }
  __attribute__((noinline))
  double f0(const s11 &v0, const double &v1) {
    const s11 v5 = f13(v0);
    s11 v3 = v5;
    v3 = v5;
    const s11 v8 = f13(v0);
    s11 v6 = v3;
    const s11 v7 = f13(v6);
    s11 v2 = v7;
    const s11 v9 = f13(v8);
    const s11 v10 = f13(v9);
    const s11 v12 = f13(v10);
    const s4 v16 = v2.p0;
    const std::vector<s3> v11 = v16.p1;
    const s3 v14 = v11[1];
    const std::vector<s9> v24 = v3.p1;
    const s1 v25 = v14.p1;
    v2.p0 = v16;
    const s0 v26 = v25.p0;
    v2.p1 = v24;
    v2.p0 = v16;
    s0 v20 = v26;
    const std::vector<s9> v17 = v10.p1;
    const std::vector<s9> v59 = v12.p1;
    const s4 v27 = f3(v16);
    const std::vector<std::vector<double>> v43 = v20.p0;
    const std::vector<double> v29 = v43[0];
    const double v35 = v29[0];
    v3.p1 = v59;
    v6.p1 = v17;
    s4 v42 = v27;
    const s4 v57 = f3(v42);
    v3.p1 = v17;
    const double v82 = v1 + v1;
    const double v52 = v35 + v82;
    v6.p0 = v57;
    return v52;
  }
  int main() {
    s11 v0({ { { { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } } }, { { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } } }, { { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } } }, { { { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } }, { { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } }, { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } } }, { { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } }, { { { { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } }, { { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } } } } }, { { { { { { { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } } }, { { { 52.0 } }, { { 53.0 }, { 54.0 }, { 55.0 } } } }, { { { { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } }, { { { 60.0 } }, { { 61.0 }, { 62.0 }, { 63.0 } } } } }, { { { { { 64.0 } }, { { 65.0 }, { 66.0 }, { 67.0 } } } }, { { { { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } } } } }, { { { { { { 72.0 } }, { { 73.0 }, { 74.0 }, { 75.0 } } }, { { { 76.0 } }, { { 77.0 }, { 78.0 }, { 79.0 } } } }, { { { { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } }, { { { 84.0 } }, { { 85.0 }, { 86.0 }, { 87.0 } } } } }, { { { { { 88.0 } }, { { 89.0 }, { 90.0 }, { 91.0 } } } }, { { { { 92.0 } }, { { 93.0 }, { 94.0 }, { 95.0 } } } } } }, { { { { { { 96.0 } }, { { 97.0 }, { 98.0 }, { 99.0 } } }, { { { 100.0 } }, { { 101.0 }, { 102.0 }, { 103.0 } } } }, { { { { 104.0 } }, { { 105.0 }, { 106.0 }, { 107.0 } } }, { { { 108.0 } }, { { 109.0 }, { 110.0 }, { 111.0 } } } } }, { { { { { 112.0 } }, { { 113.0 }, { 114.0 }, { 115.0 } } } }, { { { { 116.0 } }, { { 117.0 }, { 118.0 }, { 119.0 } } } } } } } });
    double v1(120.0);
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
