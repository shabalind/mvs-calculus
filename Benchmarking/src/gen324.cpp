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
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s1 p0;
    std::vector<s2> p1;
    s7(s1 v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    s0 p0;
    s2 p1;
    std::vector<std::vector<s7>> p2;
    std::vector<std::vector<s0>> p3;
    std::vector<s7> p4;
    s8(s0 v0, s2 v1, std::vector<std::vector<s7>> v2, std::vector<std::vector<s0>> v3, std::vector<s7> v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  s2 f60(const s2 &v0) {
    const s0 v4 = v0.p1;
    s0 v1 = v4;
    s2 v7 = v0;
    v7.p0 = v1;
    s0 v3 = v1;
    const s0 v6 = v0.p1;
    s2 v10 = v7;
    v10.p0 = v3;
    const s0 v9 = v10.p0;
    const s0 v14 = v7.p1;
    s2 v17 = v0;
    v10.p0 = v4;
    const s0 v2 = v7.p1;
    const s0 v20 = v10.p1;
    s0 v16 = v9;
    const s0 v23 = v7.p0;
    const s0 v30 = v17.p0;
    v7.p0 = v23;
    const std::vector<std::vector<double>> v12 = v3.p1;
    const s0 v35 = v7.p0;
    v10.p0 = v30;
    const std::vector<std::vector<double>> v28 = v2.p1;
    v17.p1 = v6;
    s0 v18 = v16;
    v18.p1 = v12;
    v10 = v17;
    const s0 v80 = v17.p0;
    s0 v52 = v30;
    v7.p0 = v35;
    const s2 v64(v4, v80);
    s2 v31 = v64;
    v1.p1 = v28;
    const std::vector<std::vector<double>> v44 = v52.p0;
    v17.p1 = v52;
    v10.p0 = v23;
    v3.p0 = v44;
    v52 = v35;
    v7.p0 = v16;
    v10.p0 = v20;
    v10.p0 = v18;
    v3 = v16;
    v7.p1 = v14;
    const std::vector<std::vector<double>> v271 = v52.p0;
    v16.p0 = v271;
    return v31;
  }
  s2 f31(const s2 &v0) {
    const s2 v1 = f60(v0);
    const s2 v7 = f60(v0);
    const s2 v14 = f60(v1);
    const std::vector<s2> v18 { v1, v7, v14 };
    const s2 v29 = v18[1];
    return v29;
  }
  s2 f28(const s2 &v0) {
    s2 v5 = v0;
    s2 v3 = v5;
    s2 v32 = v3;
    const s2 v73 = f31(v32);
    return v73;
  }
  s8 f1(const s8 &v0) {
    s8 v2 = v0;
    const s2 v6 = v0.p1;
    s8 v4 = v2;
    v2.p1 = v6;
    const s2 v8 = f31(v6);
    v2.p1 = v8;
    v4.p1 = v8;
    s8 v9 = v4;
    s8 v10 = v4;
    const s2 v16 = f28(v6);
    s8 v30 = v4;
    s2 v12 = v16;
    v30 = v0;
    v30 = v10;
    const s0 v61 = v6.p1;
    const std::vector<std::vector<s7>> v53 = v9.p2;
    v30.p1 = v12;
    v30.p2 = v53;
    v30.p2 = v53;
    v2.p0 = v61;
    return v30;
  }
  __attribute__((noinline))
  double f0(const s8 &v0, const double &v1) {
    const s8 v7 = f1(v0);
    const std::vector<s7> v6 = v7.p4;
    const s7 v11 = v6[1];
    const std::vector<s2> v18 = v11.p1;
    const s2 v17 = v18[0];
    s2 v34 = v17;
    const s2 v26 = f28(v34);
    const s0 v43 = v26.p1;
    const std::vector<std::vector<double>> v45 = v43.p0;
    std::vector<std::vector<double>> v46 = v45;
    const std::vector<double> v56 = v46[1];
    v46 = v45;
    v46[0] = v56;
    const double v96 = v56[0];
    return v96;
  }
  int main() {
    s8 v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } }, { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } } }, { { { { { { { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } } }, { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } } } }, { { { { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } }, { { { 30.0 }, { 31.0 } }, { { 32.0 }, { 33.0 }, { 34.0 } } } }, { { { { 35.0 }, { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } }, { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 }, { 44.0 } } } } } } } }, { { { { { 45.0 }, { 46.0 } }, { { 47.0 }, { 48.0 }, { 49.0 } } } }, { { { { 50.0 }, { 51.0 } }, { { 52.0 }, { 53.0 }, { 54.0 } } } }, { { { { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } } }, { { { { { { { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 }, { 64.0 } } } } }, { { { { 65.0 }, { 66.0 } }, { { 67.0 }, { 68.0 }, { 69.0 } } } } }, { { { { { 70.0 }, { 71.0 } }, { { 72.0 }, { 73.0 }, { 74.0 } } }, { { { 75.0 }, { 76.0 } }, { { 77.0 }, { 78.0 }, { 79.0 } } } }, { { { { 80.0 }, { 81.0 } }, { { 82.0 }, { 83.0 }, { 84.0 } } }, { { { 85.0 }, { 86.0 } }, { { 87.0 }, { 88.0 }, { 89.0 } } } } } }, { { { { { { { 90.0 }, { 91.0 } }, { { 92.0 }, { 93.0 }, { 94.0 } } } } }, { { { { 95.0 }, { 96.0 } }, { { 97.0 }, { 98.0 }, { 99.0 } } } } }, { { { { { 100.0 }, { 101.0 } }, { { 102.0 }, { 103.0 }, { 104.0 } } }, { { { 105.0 }, { 106.0 } }, { { 107.0 }, { 108.0 }, { 109.0 } } } }, { { { { 110.0 }, { 111.0 } }, { { 112.0 }, { 113.0 }, { 114.0 } } }, { { { 115.0 }, { 116.0 } }, { { 117.0 }, { 118.0 }, { 119.0 } } } } } } } });
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
