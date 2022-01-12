  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    double p1;
    s0(std::vector<std::vector<double>> v0, double v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    s1 p1;
    s2(std::vector<s1> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<std::vector<s2>> p0;
    s2 p1;
    s3(std::vector<std::vector<s2>> v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s1 p0;
    std::vector<s0> p1;
    s4(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s4 f5(const s4 &v0) {
    const std::vector<s0> v4 = v0.p1;
    s4 v7 = v0;
    std::vector<s0> v2 = v4;
    const s0 v1 = v2[0];
    const s0 v9 = v2[0];
    v7.p1 = v2;
    const std::vector<std::vector<double>> v3 = v1.p0;
    v7.p1 = v2;
    s0 v11 = v1;
    const s0 v13 = v2[0];
    v7.p1 = v2;
    const std::vector<std::vector<double>> v6 = v11.p0;
    const double v10 = v9.p1;
    const std::vector<double> v18 = v6[1];
    const std::vector<double> v24 = v6[0];
    s0 v16 = v11;
    const double v21 = v24[0];
    const double v15 = v10 + v10;
    v11.p1 = v10;
    const std::vector<std::vector<double>> v23 = v16.p0;
    s0 v27 = v13;
    const std::vector<double> v14 = v3[0];
    v27.p0 = v3;
    s4 v42 = v0;
    v2[0] = v11;
    s4 v20 = v42;
    const s1 v22 = v0.p0;
    const s1 v32 = v7.p0;
    std::vector<std::vector<double>> v53 = v3;
    const s1 v28 = v7.p0;
    const s0 v85 = v4[0];
    std::vector<std::vector<double>> v31 = v23;
    const std::vector<std::vector<s0>> v30 = v22.p0;
    v31[0] = v18;
    v16.p0 = v53;
    const double v25 = v14[0];
    s4 v59 = v7;
    v42.p0 = v28;
    std::vector<double> v92 = v18;
    std::vector<std::vector<double>> v50 = v23;
    const std::vector<s0> v54 = v30[0];
    v20 = v0;
    const s1 v83 = v20.p0;
    v59.p0 = v32;
    const s0 v52 = v28.p1;
    const std::vector<std::vector<double>> v58 = v85.p0;
    v7.p0 = v83;
    s1 v72 = v28;
    const std::vector<s0> v97 { v85, v27, v27, v85 };
    const s0 v45 = v97[2];
    v50 = v31;
    v92[0] = v15;
    const double v113 = v21 - v25;
    v59.p1 = v54;
    const std::vector<s0> v44 = v30[0];
    v72.p1 = v45;
    const double v73 = v52.p1;
    const s0 v74 = v44[0];
    const std::vector<std::vector<s0>> v108 = v72.p0;
    v50[0] = v24;
    const s1 v105(v108, v11);
    const std::vector<double> v185 = v23[0];
    v11.p1 = v73;
    v27 = v16;
    v53[1] = v185;
    const std::vector<double> v84 = v58[1];
    v20.p0 = v105;
    const s0 v143 = v72.p1;
    v16.p1 = v113;
    v27.p0 = v50;
    v31[0] = v92;
    v50[1] = v92;
    v72.p1 = v74;
    v2[0] = v143;
    v72.p1 = v85;
    v50[1] = v84;
    return v59;
  }
  s4 f4(const std::vector<s2> &v0, const s4 &v1) {
    const s4 v3 = f5(v1);
    s4 v4 = v3;
    s4 v8 = v4;
    const s2 v2 = v0[0];
    const s4 v10 = f5(v8);
    const s4 v16 = f5(v10);
    const std::vector<s0> v27 = v16.p1;
    std::vector<s0> v37 = v27;
    const s1 v28 = v2.p1;
    const std::vector<s0> v56 = v16.p1;
    v4.p1 = v37;
    v4.p1 = v27;
    v4.p0 = v28;
    s4 v122 = v4;
    v8.p1 = v37;
    v122.p1 = v56;
    v8.p1 = v37;
    return v122;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const std::vector<std::vector<s3>> &v1, const std::vector<s4> &v2, const double &v3) {
    double v6 = v3;
    double v8 = v3;
    std::vector<s4> v7 = v2;
    v7 = v2;
    const std::vector<std::vector<s2>> v16 = v0.p0;
    const std::vector<s2> v26 = v16[0];
    std::vector<s4> v15 = v7;
    const s4 v59 = v7[2];
    std::vector<s4> v25 = v2;
    const s4 v24 = f4(v26, v59);
    v25[0] = v24;
    const std::vector<s0> v35 = v24.p1;
    v7 = v15;
    const s0 v49 = v35[0];
    const double v85 = v49.p1;
    v7 = v25;
    const double v188 = v8 * v85;
    const double v54 = v188 / v6;
    v15[0] = v59;
    return v54;
  }
  int main() {
    s3 v0({ { { { { { { { { { { 0.0 }, { 1.0 } }, 2.0 } } }, { { { 3.0 }, { 4.0 } }, 5.0 } }, { { { { { { 6.0 }, { 7.0 } }, 8.0 } } }, { { { 9.0 }, { 10.0 } }, 11.0 } } }, { { { { { { 12.0 }, { 13.0 } }, 14.0 } } }, { { { 15.0 }, { 16.0 } }, 17.0 } } } }, { { { { { { { { { 18.0 }, { 19.0 } }, 20.0 } } }, { { { 21.0 }, { 22.0 } }, 23.0 } }, { { { { { { 24.0 }, { 25.0 } }, 26.0 } } }, { { { 27.0 }, { 28.0 } }, 29.0 } } }, { { { { { { 30.0 }, { 31.0 } }, 32.0 } } }, { { { 33.0 }, { 34.0 } }, 35.0 } } } } }, { { { { { { { { 36.0 }, { 37.0 } }, 38.0 } } }, { { { 39.0 }, { 40.0 } }, 41.0 } }, { { { { { { 42.0 }, { 43.0 } }, 44.0 } } }, { { { 45.0 }, { 46.0 } }, 47.0 } } }, { { { { { { 48.0 }, { 49.0 } }, 50.0 } } }, { { { 51.0 }, { 52.0 } }, 53.0 } } } });
    std::vector<std::vector<s3>> v1({ { { { { { { { { { { { { 54.0 }, { 55.0 } }, 56.0 } } }, { { { 57.0 }, { 58.0 } }, 59.0 } }, { { { { { { 60.0 }, { 61.0 } }, 62.0 } } }, { { { 63.0 }, { 64.0 } }, 65.0 } } }, { { { { { { 66.0 }, { 67.0 } }, 68.0 } } }, { { { 69.0 }, { 70.0 } }, 71.0 } } } }, { { { { { { { { { 72.0 }, { 73.0 } }, 74.0 } } }, { { { 75.0 }, { 76.0 } }, 77.0 } }, { { { { { { 78.0 }, { 79.0 } }, 80.0 } } }, { { { 81.0 }, { 82.0 } }, 83.0 } } }, { { { { { { 84.0 }, { 85.0 } }, 86.0 } } }, { { { 87.0 }, { 88.0 } }, 89.0 } } } } }, { { { { { { { { 90.0 }, { 91.0 } }, 92.0 } } }, { { { 93.0 }, { 94.0 } }, 95.0 } }, { { { { { { 96.0 }, { 97.0 } }, 98.0 } } }, { { { 99.0 }, { 100.0 } }, 101.0 } } }, { { { { { { 102.0 }, { 103.0 } }, 104.0 } } }, { { { 105.0 }, { 106.0 } }, 107.0 } } } } } });
    std::vector<s4> v2({ { { { { { { { 108.0 }, { 109.0 } }, 110.0 } } }, { { { 111.0 }, { 112.0 } }, 113.0 } }, { { { { 114.0 }, { 115.0 } }, 116.0 } } }, { { { { { { { 117.0 }, { 118.0 } }, 119.0 } } }, { { { 120.0 }, { 121.0 } }, 122.0 } }, { { { { 123.0 }, { 124.0 } }, 125.0 } } }, { { { { { { { 126.0 }, { 127.0 } }, 128.0 } } }, { { { 129.0 }, { 130.0 } }, 131.0 } }, { { { { 132.0 }, { 133.0 } }, 134.0 } } } });
    double v3(135.0);
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
