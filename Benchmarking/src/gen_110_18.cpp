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
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s1 p1;
    s2(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    std::vector<s2> p1;
    s3(s2 v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    s3 p0;
    std::vector<s2> p1;
    s8(s3 v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  struct s11 {
    s8 p0;
    s3 p1;
    s11(s8 v0, s3 v1): p0(v0), p1(v1) { }
  };
  double f90(const double &v0) {
    double v6 = v0;
    double v2 = v0;
    double v7 = v6;
    double v1 = v7;
    double v3 = v6;
    double v4 = v3;
    const double v18 = v7 - v4;
    double v9 = v7;
    v3 = v18;
    double v15 = v7;
    v4 = v1;
    double v13 = v15;
    double v8 = v15;
    double v11 = v9;
    double v10 = v4;
    double v14 = v3;
    double v16 = v8;
    double v34 = v11;
    double v24 = v7;
    double v21 = v18;
    double v20 = v9;
    const std::vector<double> v40 { v16, v16, v24 };
    std::vector<double> v30 = v40;
    v30[0] = v14;
    double v42 = v34;
    std::vector<double> v39 = v30;
    const double v32 = v39[0];
    std::vector<double> v82 = v40;
    std::vector<double> v58 = v40;
    v82[2] = v10;
    v58[1] = v16;
    v58[0] = v6;
    std::vector<double> v45 = v58;
    v30[2] = v34;
    std::vector<double> v84 = v40;
    v30[2] = v1;
    const std::vector<std::vector<double>> v22 { v40 };
    std::vector<std::vector<double>> v41 = v22;
    const std::vector<double> v75 = v41[0];
    const std::vector<std::vector<double>> v76 { v84, v75, v82, v58, v84, v40 };
    v84[1] = v9;
    v14 = v0;
    v41[0] = v45;
    const std::vector<double> v71 = v76[2];
    v84[2] = v32;
    v82[2] = v21;
    v30[2] = v42;
    v30[0] = v15;
    v41[0] = v39;
    v58 = v82;
    const double v162 = v71[0];
    v7 = v20;
    v58[0] = v13;
    v58[1] = v2;
    return v162;
  }
  double f31(const double &v0) {
    double v1 = v0;
    double v3 = v0;
    const double v7 = f90(v1);
    double v2 = v3;
    double v4 = v7;
    v3 = v7;
    double v6 = v4;
    const double v5 = f90(v2);
    const double v8 = f90(v5);
    double v14 = v3;
    const std::vector<double> v18 { v8, v6, v14, v0, v5 };
    std::vector<double> v23 = v18;
    const double v13 = v23[2];
    return v13;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s11>> &v0, const s3 &v1, const double &v2) {
    double v5 = v2;
    const double v15 = f90(v5);
    double v14 = v15;
    v14 = v5;
    const double v25 = f31(v15);
    const double v29 = f90(v25);
    const std::vector<double> v21 { v14, v25, v15 };
    std::vector<double> v83 = v21;
    const double v52 = v83[1];
    v83[0] = v14;
    const double v132 = f31(v29);
    const double v66 = v52 + v132;
    const double v120 = f90(v52);
    v83[2] = v120;
    return v66;
  }
  int main() {
    std::vector<std::vector<s11>> v0({ { { { { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { { { 3.0 } }, { { 4.0 }, { 5.0 } } } }, { { { 6.0 } }, { { 7.0 }, { 8.0 } } } } }, { { { { { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { { { 12.0 } }, { { 13.0 }, { 14.0 } } } }, { { { 15.0 } }, { { 16.0 }, { 17.0 } } } } }, { { { { 18.0 } }, { { 19.0 }, { 20.0 } } }, { { { { { 21.0 } }, { { 22.0 }, { 23.0 } } } }, { { { 24.0 } }, { { 25.0 }, { 26.0 } } } } }, { { { { 27.0 } }, { { 28.0 }, { 29.0 } } }, { { { { { 30.0 } }, { { 31.0 }, { 32.0 } } } }, { { { 33.0 } }, { { 34.0 }, { 35.0 } } } } } } }, { { { { { 36.0 } }, { { 37.0 }, { 38.0 } } }, { { { { { 39.0 } }, { { 40.0 }, { 41.0 } } } }, { { { 42.0 } }, { { 43.0 }, { 44.0 } } } } }, { { { { 45.0 } }, { { 46.0 }, { 47.0 } } }, { { { { { 48.0 } }, { { 49.0 }, { 50.0 } } } }, { { { 51.0 } }, { { 52.0 }, { 53.0 } } } } } } }, { { { { { 54.0 } }, { { 55.0 }, { 56.0 } } }, { { { { { 57.0 } }, { { 58.0 }, { 59.0 } } } }, { { { 60.0 } }, { { 61.0 }, { 62.0 } } } } }, { { { { { 63.0 } }, { { 64.0 }, { 65.0 } } }, { { { { { 66.0 } }, { { 67.0 }, { 68.0 } } } }, { { { 69.0 } }, { { 70.0 }, { 71.0 } } } } }, { { { { 72.0 } }, { { 73.0 }, { 74.0 } } }, { { { { { 75.0 } }, { { 76.0 }, { 77.0 } } } }, { { { 78.0 } }, { { 79.0 }, { 80.0 } } } } }, { { { { 81.0 } }, { { 82.0 }, { 83.0 } } }, { { { { { 84.0 } }, { { 85.0 }, { 86.0 } } } }, { { { 87.0 } }, { { 88.0 }, { 89.0 } } } } } } } } }, { { { { { { { { 90.0 } }, { { 91.0 }, { 92.0 } } }, { { { { { 93.0 } }, { { 94.0 }, { 95.0 } } } }, { { { 96.0 } }, { { 97.0 }, { 98.0 } } } } }, { { { { { 99.0 } }, { { 100.0 }, { 101.0 } } }, { { { { { 102.0 } }, { { 103.0 }, { 104.0 } } } }, { { { 105.0 } }, { { 106.0 }, { 107.0 } } } } }, { { { { 108.0 } }, { { 109.0 }, { 110.0 } } }, { { { { { 111.0 } }, { { 112.0 }, { 113.0 } } } }, { { { 114.0 } }, { { 115.0 }, { 116.0 } } } } }, { { { { 117.0 } }, { { 118.0 }, { 119.0 } } }, { { { { { 120.0 } }, { { 121.0 }, { 122.0 } } } }, { { { 123.0 } }, { { 124.0 }, { 125.0 } } } } } } }, { { { { { 126.0 } }, { { 127.0 }, { 128.0 } } }, { { { { { 129.0 } }, { { 130.0 }, { 131.0 } } } }, { { { 132.0 } }, { { 133.0 }, { 134.0 } } } } }, { { { { 135.0 } }, { { 136.0 }, { 137.0 } } }, { { { { { 138.0 } }, { { 139.0 }, { 140.0 } } } }, { { { 141.0 } }, { { 142.0 }, { 143.0 } } } } } } }, { { { { { 144.0 } }, { { 145.0 }, { 146.0 } } }, { { { { { 147.0 } }, { { 148.0 }, { 149.0 } } } }, { { { 150.0 } }, { { 151.0 }, { 152.0 } } } } }, { { { { { 153.0 } }, { { 154.0 }, { 155.0 } } }, { { { { { 156.0 } }, { { 157.0 }, { 158.0 } } } }, { { { 159.0 } }, { { 160.0 }, { 161.0 } } } } }, { { { { 162.0 } }, { { 163.0 }, { 164.0 } } }, { { { { { 165.0 } }, { { 166.0 }, { 167.0 } } } }, { { { 168.0 } }, { { 169.0 }, { 170.0 } } } } }, { { { { 171.0 } }, { { 172.0 }, { 173.0 } } }, { { { { { 174.0 } }, { { 175.0 }, { 176.0 } } } }, { { { 177.0 } }, { { 178.0 }, { 179.0 } } } } } } } } } });
    s3 v1({ { { { { 180.0 } }, { { 181.0 }, { 182.0 } } }, { { { { { 183.0 } }, { { 184.0 }, { 185.0 } } } }, { { { 186.0 } }, { { 187.0 }, { 188.0 } } } } }, { { { { { 189.0 } }, { { 190.0 }, { 191.0 } } }, { { { { { 192.0 } }, { { 193.0 }, { 194.0 } } } }, { { { 195.0 } }, { { 196.0 }, { 197.0 } } } } }, { { { { 198.0 } }, { { 199.0 }, { 200.0 } } }, { { { { { 201.0 } }, { { 202.0 }, { 203.0 } } } }, { { { 204.0 } }, { { 205.0 }, { 206.0 } } } } }, { { { { 207.0 } }, { { 208.0 }, { 209.0 } } }, { { { { { 210.0 } }, { { 211.0 }, { 212.0 } } } }, { { { 213.0 } }, { { 214.0 }, { 215.0 } } } } } } });
    double v2(216.0);
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
