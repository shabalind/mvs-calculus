  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s0> p0;
    std::vector<s1> p1;
    s3(std::vector<s0> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s1> p0;
    std::vector<std::vector<s1>> p1;
    s4(std::vector<s1> v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s3> p0;
    s1 p1;
    s5(std::vector<s3> v0, s1 v1): p0(v0), p1(v1) { }
  };
  double f108(const double &v0) {
    double v1 = v0;
    double v2 = v1;
    double v5 = v2;
    double v7 = v0;
    double v10 = v0;
    double v8 = v2;
    double v4 = v2;
    double v6 = v4;
    double v11 = v8;
    double v12 = v1;
    double v13 = v10;
    double v9 = v1;
    double v19 = v6;
    double v18 = v19;
    double v17 = v11;
    double v23 = v7;
    v18 = v0;
    double v27 = v6;
    double v28 = v6;
    double v61 = v7;
    v7 = v0;
    double v36 = v61;
    double v16 = v0;
    double v53 = v9;
    double v33 = v23;
    double v46 = v27;
    double v31 = v46;
    double v39 = v18;
    double v40 = v5;
    double v64 = v0;
    double v34 = v16;
    double v50 = v17;
    double v63 = v13;
    double v49 = v64;
    const double v41 = v61 + v31;
    double v48 = v41;
    double v77 = v34;
    v19 = v48;
    v6 = v39;
    v49 = v28;
    double v74 = v53;
    v46 = v31;
    double v51 = v33;
    double v174 = v40;
    v13 = v5;
    const double v258 = v1 * v50;
    const std::vector<double> v204 { v77, v51, v49, v174, v258 };
    const std::vector<std::vector<double>> v59 { v204, v204 };
    const std::vector<double> v88 = v59[1];
    std::vector<std::vector<double>> v161 = v59;
    std::vector<std::vector<double>> v120 = v161;
    v6 = v36;
    v120[1] = v88;
    v120[1] = v204;
    std::vector<std::vector<double>> v70 = v120;
    std::vector<std::vector<double>> v97 = v161;
    const std::vector<double> v131 = v97[0];
    const std::vector<double> v114 = v120[1];
    const std::vector<double> v109 = v70[1];
    v70[1] = v131;
    v161[1] = v88;
    v120[0] = v114;
    v97[1] = v109;
    std::vector<double> v87 = v204;
    v87[1] = v12;
    v87[4] = v63;
    v70[1] = v87;
    v87[4] = v74;
    const double v302 = v109[2];
    return v302;
  }
  __attribute__((noinline))
  double f0(const s5 &v0, const s0 &v1, const s4 &v2, const double &v3) {
    const double v7 = f108(v3);
    const double v16 = f108(v7);
    double v27 = v16;
    return v27;
  }
  int main() {
    s5 v0({ { { { { { 0.0, 1.0 }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { 5.0, 6.0 }, { { 7.0 }, { 8.0 }, { 9.0 } } }, { { 10.0, 11.0 }, { { 12.0 }, { 13.0 }, { 14.0 } } } }, { { { { 15.0, 16.0 }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { 20.0, 21.0 }, { { 22.0 }, { 23.0 }, { 24.0 } } } }, { { { 25.0, 26.0 }, { { 27.0 }, { 28.0 }, { 29.0 } } }, { { 30.0, 31.0 }, { { 32.0 }, { 33.0 }, { 34.0 } } } } } }, { { { { 35.0, 36.0 }, { { 37.0 }, { 38.0 }, { 39.0 } } }, { { 40.0, 41.0 }, { { 42.0 }, { 43.0 }, { 44.0 } } }, { { 45.0, 46.0 }, { { 47.0 }, { 48.0 }, { 49.0 } } } }, { { { { 50.0, 51.0 }, { { 52.0 }, { 53.0 }, { 54.0 } } }, { { 55.0, 56.0 }, { { 57.0 }, { 58.0 }, { 59.0 } } } }, { { { 60.0, 61.0 }, { { 62.0 }, { 63.0 }, { 64.0 } } }, { { 65.0, 66.0 }, { { 67.0 }, { 68.0 }, { 69.0 } } } } } }, { { { { 70.0, 71.0 }, { { 72.0 }, { 73.0 }, { 74.0 } } }, { { 75.0, 76.0 }, { { 77.0 }, { 78.0 }, { 79.0 } } }, { { 80.0, 81.0 }, { { 82.0 }, { 83.0 }, { 84.0 } } } }, { { { { 85.0, 86.0 }, { { 87.0 }, { 88.0 }, { 89.0 } } }, { { 90.0, 91.0 }, { { 92.0 }, { 93.0 }, { 94.0 } } } }, { { { 95.0, 96.0 }, { { 97.0 }, { 98.0 }, { 99.0 } } }, { { 100.0, 101.0 }, { { 102.0 }, { 103.0 }, { 104.0 } } } } } } }, { { { 105.0, 106.0 }, { { 107.0 }, { 108.0 }, { 109.0 } } }, { { 110.0, 111.0 }, { { 112.0 }, { 113.0 }, { 114.0 } } } } });
    s0 v1({ { 115.0, 116.0 }, { { 117.0 }, { 118.0 }, { 119.0 } } });
    s4 v2({ { { { { 120.0, 121.0 }, { { 122.0 }, { 123.0 }, { 124.0 } } }, { { 125.0, 126.0 }, { { 127.0 }, { 128.0 }, { 129.0 } } } } }, { { { { { 130.0, 131.0 }, { { 132.0 }, { 133.0 }, { 134.0 } } }, { { 135.0, 136.0 }, { { 137.0 }, { 138.0 }, { 139.0 } } } } }, { { { { 140.0, 141.0 }, { { 142.0 }, { 143.0 }, { 144.0 } } }, { { 145.0, 146.0 }, { { 147.0 }, { 148.0 }, { 149.0 } } } } }, { { { { 150.0, 151.0 }, { { 152.0 }, { 153.0 }, { 154.0 } } }, { { 155.0, 156.0 }, { { 157.0 }, { 158.0 }, { 159.0 } } } } } } });
    double v3(160.0);
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
