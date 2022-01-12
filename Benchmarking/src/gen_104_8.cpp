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
    s0 p1;
    std::vector<std::vector<s0>> p2;
    s0 p3;
    std::vector<s0> p4;
    s1(std::vector<s0> v0, s0 v1, std::vector<std::vector<s0>> v2, s0 v3, std::vector<s0> v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  struct s6 {
    std::vector<s1> p0;
    s1 p1;
    s6(std::vector<s1> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s9 {
    s6 p0;
    s0 p1;
    s9(s6 v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f35(const double &v0) {
    double v2 = v0;
    double v1 = v0;
    const double v6 = v2 - v0;
    double v8 = v0;
    double v5 = v6;
    double v13 = v1;
    const std::vector<double> v7 { v13, v0, v5 };
    std::vector<double> v10 = v7;
    double v22 = v0;
    v10[0] = v5;
    std::vector<double> v14 = v10;
    v10[0] = v0;
    v10[1] = v13;
    v14[2] = v2;
    v10[0] = v8;
    v14 = v7;
    v10[2] = v22;
    v10[1] = v5;
    std::vector<double> v17 = v7;
    const double v31 = v14[1];
    const double v36 = v17[2];
    std::vector<double> v58 = v7;
    v2 = v0;
    const double v23 = v58[1];
    const double v26 = v5 * v23;
    v13 = v36;
    v58[1] = v31;
    return v26;
  }
  __attribute__((noinline))
  double f0(const s9 &v0, const double &v1) {
    s9 v7 = v0;
    const std::vector<s9> v5 { v7, v7, v0, v7, v0, v0, v7 };
    const s9 v9 = v5[1];
    const s0 v3 = v7.p1;
    const std::vector<std::vector<double>> v8 = v3.p0;
    const double v14 = f35(v1);
    const std::vector<std::vector<s9>> v10 { v5 };
    const double v21 = f35(v14);
    const std::vector<s9> v13 = v10[0];
    const s6 v11 = v7.p0;
    std::vector<s9> v17 = v5;
    v7.p1 = v3;
    v17 = v13;
    v17[0] = v9;
    const s9 v16 = v17[0];
    const s6 v26 = v16.p0;
    const double v25 = f35(v21);
    v7.p0 = v26;
    const std::vector<double> v35 = v8[1];
    const double v42 = v35[0];
    const s9 v24 = v5[2];
    const double v18 = f35(v42);
    const s1 v49 = v11.p1;
    const s9 v33 = v5[1];
    std::vector<s9> v82 = v5;
    const s9 v44 = v13[6];
    const double v57 = v25 * v18;
    const s9 v40 = v82[1];
    const s0 v47 = v40.p1;
    const double v43 = f35(v57);
    v17[6] = v24;
    s9 v38 = v44;
    const s6 v70 = v44.p0;
    v38.p0 = v11;
    v7.p0 = v70;
    v82[5] = v33;
    v17[3] = v38;
    s1 v131 = v49;
    s9 v91 = v7;
    v82[4] = v91;
    const s0 v125 = v49.p3;
    v91.p1 = v47;
    v38.p1 = v125;
    const std::vector<s0> v176 = v131.p0;
    v91.p0 = v11;
    v17[5] = v91;
    const s0 v207 = v176[0];
    v7.p1 = v207;
    const double v150 = f35(v43);
    v131.p4 = v176;
    return v150;
  }
  int main() {
    s9 v0({ { { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } }, { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } }, { { { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } }, { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } }, { { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } }, { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 }, { 40.0 }, { 41.0 } } } } }, { { { { { 42.0 }, { 43.0 }, { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } }, { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 }, { 52.0 }, { 53.0 } } } }, { { { 54.0 }, { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } }, { { { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 }, { 64.0 }, { 65.0 } } } } }, { { { 66.0 }, { 67.0 }, { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } }, { { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 }, { 76.0 }, { 77.0 } } }, { { { 78.0 }, { 79.0 }, { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } } } }, { { { { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 }, { 88.0 }, { 89.0 } } }, { { { 90.0 }, { 91.0 }, { 92.0 } }, { { 93.0 }, { 94.0 }, { 95.0 } } } }, { { { 96.0 }, { 97.0 }, { 98.0 } }, { { 99.0 }, { 100.0 }, { 101.0 } } }, { { { { { 102.0 }, { 103.0 }, { 104.0 } }, { { 105.0 }, { 106.0 }, { 107.0 } } } } }, { { { 108.0 }, { 109.0 }, { 110.0 } }, { { 111.0 }, { 112.0 }, { 113.0 } } }, { { { { 114.0 }, { 115.0 }, { 116.0 } }, { { 117.0 }, { 118.0 }, { 119.0 } } }, { { { 120.0 }, { 121.0 }, { 122.0 } }, { { 123.0 }, { 124.0 }, { 125.0 } } } } } }, { { { { { 126.0 }, { 127.0 }, { 128.0 } }, { { 129.0 }, { 130.0 }, { 131.0 } } }, { { { 132.0 }, { 133.0 }, { 134.0 } }, { { 135.0 }, { 136.0 }, { 137.0 } } } }, { { { 138.0 }, { 139.0 }, { 140.0 } }, { { 141.0 }, { 142.0 }, { 143.0 } } }, { { { { { 144.0 }, { 145.0 }, { 146.0 } }, { { 147.0 }, { 148.0 }, { 149.0 } } } } }, { { { 150.0 }, { 151.0 }, { 152.0 } }, { { 153.0 }, { 154.0 }, { 155.0 } } }, { { { { 156.0 }, { 157.0 }, { 158.0 } }, { { 159.0 }, { 160.0 }, { 161.0 } } }, { { { 162.0 }, { 163.0 }, { 164.0 } }, { { 165.0 }, { 166.0 }, { 167.0 } } } } } }, { { { 168.0 }, { 169.0 }, { 170.0 } }, { { 171.0 }, { 172.0 }, { 173.0 } } } });
    double v1(174.0);
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
