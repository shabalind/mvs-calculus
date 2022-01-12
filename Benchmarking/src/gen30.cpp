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
    std::vector<s0> p1;
    double p2;
    s1(s0 v0, std::vector<s0> v1, double v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s1 p1;
    s0 p2;
    s0 p3;
    s2(std::vector<s0> v0, s1 v1, s0 v2, s0 v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s3 {
    std::vector<s0> p0;
    s2 p1;
    s3(std::vector<s0> v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s0 p0;
    s3 p1;
    s4(s0 v0, s3 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s2 p0;
    s4 p1;
    s6(s2 v0, s4 v1): p0(v0), p1(v1) { }
  };
  std::vector<s6> f11(const std::vector<s6> &v0) {
    const s6 v2 = v0[0];
    std::vector<s6> v6 = v0;
    s6 v4 = v2;
    v6[0] = v4;
    const s2 v7 = v2.p0;
    v4.p0 = v7;
    v6[0] = v2;
    const s6 v10 = v0[0];
    const s6 v1 = v6[0];
    v6[0] = v10;
    v6[0] = v1;
    return v6;
  }
  s0 f10(const s0 &v0) {
    s0 v3 = v0;
    s0 v7 = v3;
    s0 v5 = v7;
    const std::vector<std::vector<double>> v2 = v5.p1;
    v7.p1 = v2;
    return v7;
  }
  s1 f9(const s1 &v0) {
    s1 v4 = v0;
    s1 v5 = v0;
    const std::vector<s0> v7 = v0.p1;
    const std::vector<s0> v3 = v4.p1;
    const std::vector<std::vector<s0>> v1 { v3, v3, v3, v7, v3, v3, v7 };
    const s0 v13 = v5.p0;
    const std::vector<s0> v10 = v1[6];
    s0 v16 = v13;
    const s0 v15 = f10(v13);
    s0 v20 = v15;
    const std::vector<double> v49 = v16.p0;
    const double v17 = v49[0];
    v5 = v0;
    const std::vector<double> v19 = v16.p0;
    const double v14 = v5.p2;
    const std::vector<double> v40 { v17 };
    const std::vector<s0> v22 = v1[5];
    const double v37 = v40[0];
    const double v23 = v49[1];
    std::vector<double> v31 = v19;
    const std::vector<double> v24 = v20.p0;
    const std::vector<std::vector<double>> v21 = v13.p1;
    const s0 v43 = v22[0];
    v4.p1 = v10;
    const std::vector<std::vector<double>> v50 = v15.p1;
    const s0 v87 = f10(v15);
    v4.p2 = v17;
    std::vector<std::vector<double>> v57 = v21;
    const std::vector<double> v44 = v50[1];
    const std::vector<double> v56 = v43.p0;
    const s0 v41(v56, v57);
    v57[0] = v44;
    const double v39 = v37 - v23;
    double v77 = v17;
    double v84 = v14;
    const double v51 = v44[0];
    v31[0] = v39;
    const double v93 = v84 / v51;
    const s0 v125 = f10(v41);
    v4.p2 = v93;
    const s0 v82 = f10(v87);
    const s0 v106 = f10(v125);
    const s0 v121 = f10(v106);
    const std::vector<std::vector<double>> v97 = v20.p1;
    std::vector<s0> v159 = v7;
    v159[1] = v121;
    const std::vector<double> v143 = v97[1];
    v31 = v24;
    v57[1] = v143;
    v5.p2 = v77;
    const s1 v209(v82, v159, v51);
    v20.p0 = v31;
    return v209;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s6>> &v0, const double &v1) {
    const std::vector<s6> v4 = v0[0];
    const std::vector<s6> v7 = v0[1];
    const std::vector<s6> v16 = f11(v4);
    const s6 v27 = v7[0];
    const s6 v39 = v16[0];
    const s4 v53 = v39.p1;
    const s3 v23 = v53.p1;
    const std::vector<s0> v93 = v23.p0;
    const s2 v70 = v27.p0;
    const s0 v38 = v93[2];
    const std::vector<double> v83 = v38.p0;
    std::vector<double> v61 = v83;
    const s1 v59 = v70.p1;
    const double v151 = v61[1];
    const s1 v109 = f9(v59);
    const double v120 = v109.p2;
    v61[1] = v120;
    return v151;
  }
  int main() {
    std::vector<std::vector<s6>> v0({ { { { { { { 0.0, 1.0 }, { { 2.0 }, { 3.0 } } }, { { 4.0, 5.0 }, { { 6.0 }, { 7.0 } } } }, { { { 8.0, 9.0 }, { { 10.0 }, { 11.0 } } }, { { { 12.0, 13.0 }, { { 14.0 }, { 15.0 } } }, { { 16.0, 17.0 }, { { 18.0 }, { 19.0 } } } }, 20.0 }, { { 21.0, 22.0 }, { { 23.0 }, { 24.0 } } }, { { 25.0, 26.0 }, { { 27.0 }, { 28.0 } } } }, { { { 29.0, 30.0 }, { { 31.0 }, { 32.0 } } }, { { { { 33.0, 34.0 }, { { 35.0 }, { 36.0 } } }, { { 37.0, 38.0 }, { { 39.0 }, { 40.0 } } }, { { 41.0, 42.0 }, { { 43.0 }, { 44.0 } } } }, { { { { 45.0, 46.0 }, { { 47.0 }, { 48.0 } } }, { { 49.0, 50.0 }, { { 51.0 }, { 52.0 } } } }, { { { 53.0, 54.0 }, { { 55.0 }, { 56.0 } } }, { { { 57.0, 58.0 }, { { 59.0 }, { 60.0 } } }, { { 61.0, 62.0 }, { { 63.0 }, { 64.0 } } } }, 65.0 }, { { 66.0, 67.0 }, { { 68.0 }, { 69.0 } } }, { { 70.0, 71.0 }, { { 72.0 }, { 73.0 } } } } } } } }, { { { { { { 74.0, 75.0 }, { { 76.0 }, { 77.0 } } }, { { 78.0, 79.0 }, { { 80.0 }, { 81.0 } } } }, { { { 82.0, 83.0 }, { { 84.0 }, { 85.0 } } }, { { { 86.0, 87.0 }, { { 88.0 }, { 89.0 } } }, { { 90.0, 91.0 }, { { 92.0 }, { 93.0 } } } }, 94.0 }, { { 95.0, 96.0 }, { { 97.0 }, { 98.0 } } }, { { 99.0, 100.0 }, { { 101.0 }, { 102.0 } } } }, { { { 103.0, 104.0 }, { { 105.0 }, { 106.0 } } }, { { { { 107.0, 108.0 }, { { 109.0 }, { 110.0 } } }, { { 111.0, 112.0 }, { { 113.0 }, { 114.0 } } }, { { 115.0, 116.0 }, { { 117.0 }, { 118.0 } } } }, { { { { 119.0, 120.0 }, { { 121.0 }, { 122.0 } } }, { { 123.0, 124.0 }, { { 125.0 }, { 126.0 } } } }, { { { 127.0, 128.0 }, { { 129.0 }, { 130.0 } } }, { { { 131.0, 132.0 }, { { 133.0 }, { 134.0 } } }, { { 135.0, 136.0 }, { { 137.0 }, { 138.0 } } } }, 139.0 }, { { 140.0, 141.0 }, { { 142.0 }, { 143.0 } } }, { { 144.0, 145.0 }, { { 146.0 }, { 147.0 } } } } } } } } });
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
