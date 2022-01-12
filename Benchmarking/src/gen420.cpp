  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    double p1;
    s0(std::vector<std::vector<double>> v0, double v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s0>> p0;
    std::vector<std::vector<s1>> p1;
    s2(std::vector<std::vector<s0>> v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    s0 p1;
    s3(s2 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<std::vector<s0>> p0;
    s3 p1;
    s4(std::vector<std::vector<s0>> v0, s3 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s3> p0;
    s5(std::vector<s3> v0): p0(v0) { }
  };
  struct s6 {
    std::vector<s4> p0;
    s5 p1;
    s6(std::vector<s4> v0, s5 v1): p0(v0), p1(v1) { }
  };
  std::vector<s0> f25(const std::vector<s0> &v0) {
    std::vector<s0> v20 = v0;
    const s0 v30 = v20[0];
    std::vector<s0> v72 = v20;
    v72[1] = v30;
    std::vector<s0> v188 = v72;
    return v188;
  }
  s0 f19(const s0 &v0) {
    const double v5 = v0.p1;
    const std::vector<std::vector<double>> v2 = v0.p0;
    s0 v11 = v0;
    const std::vector<std::vector<double>> v14 = v11.p0;
    v11.p0 = v14;
    v11.p0 = v2;
    const s0 v92(v14, v5);
    return v92;
  }
  s0 f12(const s0 &v0) {
    const std::vector<s0> v4 { v0, v0 };
    const double v1 = v0.p1;
    const double v2 = v1 / v1;
    const s0 v6 = v4[0];
    const double v3 = v6.p1;
    const double v7 = v1 + v2;
    const s0 v8 = v4[1];
    std::vector<s0> v9 = v4;
    const std::vector<std::vector<double>> v10 = v8.p0;
    const std::vector<std::vector<double>> v13 = v6.p0;
    const std::vector<double> v11 = v10[1];
    const std::vector<s0> v14 = f25(v9);
    std::vector<double> v5 = v11;
    v9 = v14;
    s0 v19 = v8;
    v19.p0 = v13;
    const double v49 = v6.p1;
    const double v29 = v5[0];
    const std::vector<double> v31 = v13[0];
    v19.p1 = v29;
    v19.p1 = v49;
    s0 v16 = v0;
    v9[1] = v16;
    const s0 v50 = f19(v0);
    v9[1] = v50;
    v16.p0 = v13;
    const std::vector<std::vector<double>> v23 = v8.p0;
    std::vector<double> v33 = v31;
    v19.p1 = v7;
    v33[0] = v3;
    const double v27 = v5[0];
    const std::vector<double> v35 = v10[0];
    std::vector<s0> v43 = v4;
    const std::vector<std::vector<double>> v39 { v11, v11, v33, v33, v33, v5 };
    std::vector<std::vector<double>> v48 = v13;
    const s0 v46(v48, v1);
    std::vector<std::vector<double>> v26 = v23;
    const std::vector<double> v51 = v39[1];
    const s0 v80(v48, v27);
    const s0 v65 = f19(v80);
    const double v85 = v6.p1;
    const s0 v56 = f19(v19);
    const std::vector<std::vector<double>> v41 = v65.p0;
    v16.p1 = v29;
    const s0 v58 = v9[1];
    std::vector<s0> v73 = v43;
    v16.p0 = v10;
    const s0 v70 = v4[0];
    v73[1] = v58;
    v5[0] = v2;
    v33[0] = v85;
    v9[0] = v46;
    const double v97 = v70.p1;
    v16.p0 = v26;
    const s0 v83 = f19(v80);
    v43[0] = v83;
    const std::vector<std::vector<double>> v118 = v56.p0;
    v16.p1 = v97;
    v73[0] = v65;
    v48[0] = v51;
    const double v145 = v35[0];
    v16.p0 = v41;
    const s0 v91 = f19(v70);
    v33[0] = v145;
    v19 = v91;
    const s0 v194 = v73[1];
    v16.p0 = v118;
    return v194;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s2>> &v0, const std::vector<s6> &v1, const std::vector<s0> &v2, const s4 &v3, const double &v4) {
    const s6 v7 = v1[0];
    const s5 v13 = v7.p1;
    const std::vector<s3> v24 = v13.p0;
    const s3 v32 = v24[0];
    const s0 v40 = v32.p1;
    const s0 v49 = f12(v40);
    const s0 v58 = f12(v49);
    const double v77 = v58.p1;
    return v77;
  }
  int main() {
    std::vector<std::vector<s2>> v0({ { { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, 3.0 } }, { { { { 4.0 }, { 5.0 }, { 6.0 } }, 7.0 } } }, { { { { { { 8.0 }, { 9.0 }, { 10.0 } }, 11.0 }, { { { { { 12.0 }, { 13.0 }, { 14.0 } }, 15.0 } } } } } } } }, { { { { { { { 16.0 }, { 17.0 }, { 18.0 } }, 19.0 } }, { { { { 20.0 }, { 21.0 }, { 22.0 } }, 23.0 } } }, { { { { { { 24.0 }, { 25.0 }, { 26.0 } }, 27.0 }, { { { { { 28.0 }, { 29.0 }, { 30.0 } }, 31.0 } } } } } } } }, { { { { { { { 32.0 }, { 33.0 }, { 34.0 } }, 35.0 } }, { { { { 36.0 }, { 37.0 }, { 38.0 } }, 39.0 } } }, { { { { { { 40.0 }, { 41.0 }, { 42.0 } }, 43.0 }, { { { { { 44.0 }, { 45.0 }, { 46.0 } }, 47.0 } } } } } } } } });
    std::vector<s6> v1({ { { { { { { { { 48.0 }, { 49.0 }, { 50.0 } }, 51.0 } } }, { { { { { { { 52.0 }, { 53.0 }, { 54.0 } }, 55.0 } }, { { { { 56.0 }, { 57.0 }, { 58.0 } }, 59.0 } } }, { { { { { { 60.0 }, { 61.0 }, { 62.0 } }, 63.0 }, { { { { { 64.0 }, { 65.0 }, { 66.0 } }, 67.0 } } } } } } }, { { { 68.0 }, { 69.0 }, { 70.0 } }, 71.0 } } }, { { { { { { 72.0 }, { 73.0 }, { 74.0 } }, 75.0 } } }, { { { { { { { 76.0 }, { 77.0 }, { 78.0 } }, 79.0 } }, { { { { 80.0 }, { 81.0 }, { 82.0 } }, 83.0 } } }, { { { { { { 84.0 }, { 85.0 }, { 86.0 } }, 87.0 }, { { { { { 88.0 }, { 89.0 }, { 90.0 } }, 91.0 } } } } } } }, { { { 92.0 }, { 93.0 }, { 94.0 } }, 95.0 } } }, { { { { { { 96.0 }, { 97.0 }, { 98.0 } }, 99.0 } } }, { { { { { { { 100.0 }, { 101.0 }, { 102.0 } }, 103.0 } }, { { { { 104.0 }, { 105.0 }, { 106.0 } }, 107.0 } } }, { { { { { { 108.0 }, { 109.0 }, { 110.0 } }, 111.0 }, { { { { { 112.0 }, { 113.0 }, { 114.0 } }, 115.0 } } } } } } }, { { { 116.0 }, { 117.0 }, { 118.0 } }, 119.0 } } } }, { { { { { { { { { 120.0 }, { 121.0 }, { 122.0 } }, 123.0 } }, { { { { 124.0 }, { 125.0 }, { 126.0 } }, 127.0 } } }, { { { { { { 128.0 }, { 129.0 }, { 130.0 } }, 131.0 }, { { { { { 132.0 }, { 133.0 }, { 134.0 } }, 135.0 } } } } } } }, { { { 136.0 }, { 137.0 }, { 138.0 } }, 139.0 } } } } } });
    std::vector<s0> v2({ { { { 140.0 }, { 141.0 }, { 142.0 } }, 143.0 } });
    s4 v3({ { { { { { 144.0 }, { 145.0 }, { 146.0 } }, 147.0 } } }, { { { { { { { 148.0 }, { 149.0 }, { 150.0 } }, 151.0 } }, { { { { 152.0 }, { 153.0 }, { 154.0 } }, 155.0 } } }, { { { { { { 156.0 }, { 157.0 }, { 158.0 } }, 159.0 }, { { { { { 160.0 }, { 161.0 }, { 162.0 } }, 163.0 } } } } } } }, { { { 164.0 }, { 165.0 }, { 166.0 } }, 167.0 } } });
    double v4(168.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
