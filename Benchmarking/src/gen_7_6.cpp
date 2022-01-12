  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s0 p2;
    s0 p3;
    std::vector<s0> p4;
    s1(s0 v0, s0 v1, s0 v2, s0 v3, std::vector<s0> v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  struct s2 {
    s1 p0;
    s1 p1;
    s2(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s0 p0;
    s0 p1;
    s5(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  std::vector<std::vector<double>> f61(const std::vector<std::vector<double>> &v0) {
    const std::vector<double> v4 = v0[1];
    const double v3 = v4[0];
    double v1 = v3;
    std::vector<double> v11 = v4;
    const std::vector<double> v7 = v0[1];
    v11[0] = v1;
    v11[0] = v3;
    const double v12 = v7[0];
    const std::vector<double> v10 = v0[1];
    std::vector<std::vector<double>> v9 = v0;
    std::vector<double> v14 = v10;
    v14[0] = v3;
    v11[0] = v12;
    const std::vector<std::vector<std::vector<double>>> v29 { v9 };
    const s0 v35(v0);
    const std::vector<std::vector<double>> v58 = v35.p0;
    std::vector<std::vector<std::vector<double>>> v21 = v29;
    const std::vector<std::vector<double>> v51 = v35.p0;
    const s0 v34(v58);
    const std::vector<std::vector<double>> v104 = v34.p0;
    const std::vector<std::vector<double>> v56 = v35.p0;
    v9[1] = v14;
    const std::vector<std::vector<double>> v71 = v34.p0;
    std::vector<std::vector<std::vector<double>>> v82 = v21;
    v9[1] = v11;
    s0 v52 = v35;
    const std::vector<std::vector<double>> v75 = v52.p0;
    const std::vector<std::vector<double>> v28 = v34.p0;
    const std::vector<std::vector<double>> v64 = v34.p0;
    v52.p0 = v75;
    const std::vector<std::vector<double>> v95 = v34.p0;
    const std::vector<s0> v114 { v52, v52, v34, v52, v34, v52 };
    const std::vector<std::vector<double>> v93 = v52.p0;
    const s0 v91 = v114[4];
    const std::vector<std::vector<double>> v132 = v34.p0;
    const std::vector<std::vector<double>> v118 = v91.p0;
    std::vector<std::vector<std::vector<double>>> v76 = v29;
    v52.p0 = v28;
    v76[0] = v104;
    const s5 v74(v91, v35);
    v52.p0 = v118;
    const s0 v205 = v114[5];
    const std::vector<std::vector<double>> v133 = v82[0];
    v14[0] = v3;
    const s0 v213 = v74.p1;
    v52.p0 = v56;
    v21[0] = v64;
    const s0 v137 = v74.p0;
    const std::vector<std::vector<double>> v149 = v76[0];
    v52.p0 = v95;
    v52.p0 = v56;
    v21[0] = v149;
    v52.p0 = v71;
    v52.p0 = v133;
    v76[0] = v51;
    v52.p0 = v132;
    const std::vector<std::vector<double>> v240 = v213.p0;
    const std::vector<std::vector<double>> v83 = v205.p0;
    v52.p0 = v83;
    v82[0] = v93;
    v52.p0 = v240;
    const std::vector<std::vector<double>> v174 = v137.p0;
    return v174;
  }
  s0 f46(const s0 &v0, const s2 &v1) {
    s0 v6 = v0;
    s0 v4 = v6;
    s0 v7 = v6;
    const std::vector<std::vector<double>> v8 = v0.p0;
    const std::vector<std::vector<double>> v34 = v4.p0;
    const std::vector<std::vector<double>> v25 = f61(v8);
    const std::vector<std::vector<double>> v13 = v6.p0;
    v6.p0 = v25;
    const s5 v14(v7, v6);
    v6.p0 = v34;
    v4.p0 = v8;
    s5 v46 = v14;
    const std::vector<std::vector<double>> v39 = f61(v13);
    v6.p0 = v8;
    const std::vector<std::vector<double>> v47 = f61(v39);
    v6.p0 = v47;
    const s0 v58 = v46.p1;
    return v58;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s2>> &v0, const double &v1) {
    const std::vector<s2> v3 = v0[2];
    const s2 v7 = v3[0];
    const s1 v9 = v7.p1;
    const std::vector<s2> v10 = v0[2];
    const s2 v13 = v10[0];
    const s0 v21 = v9.p2;
    const s0 v26 = f46(v21, v13);
    const std::vector<std::vector<double>> v58 = v26.p0;
    const std::vector<double> v133 = v58[1];
    const double v103 = v133[0];
    return v103;
  }
  int main() {
    std::vector<std::vector<s2>> v0({ { { { { { { 0.0 }, { 1.0 }, { 2.0 } } }, { { { 3.0 }, { 4.0 }, { 5.0 } } }, { { { 6.0 }, { 7.0 }, { 8.0 } } }, { { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } } }, { { { 15.0 }, { 16.0 }, { 17.0 } } } } }, { { { { 18.0 }, { 19.0 }, { 20.0 } } }, { { { 21.0 }, { 22.0 }, { 23.0 } } }, { { { 24.0 }, { 25.0 }, { 26.0 } } }, { { { 27.0 }, { 28.0 }, { 29.0 } } }, { { { { 30.0 }, { 31.0 }, { 32.0 } } }, { { { 33.0 }, { 34.0 }, { 35.0 } } } } } } }, { { { { { { 36.0 }, { 37.0 }, { 38.0 } } }, { { { 39.0 }, { 40.0 }, { 41.0 } } }, { { { 42.0 }, { 43.0 }, { 44.0 } } }, { { { 45.0 }, { 46.0 }, { 47.0 } } }, { { { { 48.0 }, { 49.0 }, { 50.0 } } }, { { { 51.0 }, { 52.0 }, { 53.0 } } } } }, { { { { 54.0 }, { 55.0 }, { 56.0 } } }, { { { 57.0 }, { 58.0 }, { 59.0 } } }, { { { 60.0 }, { 61.0 }, { 62.0 } } }, { { { 63.0 }, { 64.0 }, { 65.0 } } }, { { { { 66.0 }, { 67.0 }, { 68.0 } } }, { { { 69.0 }, { 70.0 }, { 71.0 } } } } } } }, { { { { { { 72.0 }, { 73.0 }, { 74.0 } } }, { { { 75.0 }, { 76.0 }, { 77.0 } } }, { { { 78.0 }, { 79.0 }, { 80.0 } } }, { { { 81.0 }, { 82.0 }, { 83.0 } } }, { { { { 84.0 }, { 85.0 }, { 86.0 } } }, { { { 87.0 }, { 88.0 }, { 89.0 } } } } }, { { { { 90.0 }, { 91.0 }, { 92.0 } } }, { { { 93.0 }, { 94.0 }, { 95.0 } } }, { { { 96.0 }, { 97.0 }, { 98.0 } } }, { { { 99.0 }, { 100.0 }, { 101.0 } } }, { { { { 102.0 }, { 103.0 }, { 104.0 } } }, { { { 105.0 }, { 106.0 }, { 107.0 } } } } } } } });
    double v1(108.0);
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
