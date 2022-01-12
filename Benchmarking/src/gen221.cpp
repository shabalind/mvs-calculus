  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    double p0;
    std::vector<std::vector<double>> p1;
    s0(double v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s1 p1;
    s2(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s1> p0;
    s1 p1;
    s1 p2;
    s3(std::vector<s1> v0, s1 v1, s1 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s4 {
    s1 p0;
    s1 p1;
    s4(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s3 p0;
    std::vector<s4> p1;
    s0 p2;
    s5(s3 v0, std::vector<s4> v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s6 {
    std::vector<std::vector<s5>> p0;
    std::vector<s4> p1;
    s6(std::vector<std::vector<s5>> v0, std::vector<s4> v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    std::vector<std::vector<s6>> p0;
    std::vector<s4> p1;
    std::vector<s0> p2;
    std::vector<std::vector<s2>> p3;
    std::vector<std::vector<s5>> p4;
    s7(std::vector<std::vector<s6>> v0, std::vector<s4> v1, std::vector<s0> v2, std::vector<std::vector<s2>> v3, std::vector<std::vector<s5>> v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  struct s8 {
    std::vector<std::vector<s5>> p0;
    s5 p1;
    s8(std::vector<std::vector<s5>> v0, s5 v1): p0(v0), p1(v1) { }
  };
  double f69(const double &v0) {
    double v3 = v0;
    double v1 = v3;
    const double v4 = v0 - v3;
    double v2 = v1;
    const double v7 = v4 / v0;
    double v5 = v4;
    double v24 = v2;
    double v14 = v3;
    v2 = v0;
    double v8 = v14;
    double v20 = v5;
    double v13 = v20;
    const double v22 = v20 + v13;
    double v15 = v7;
    double v18 = v24;
    double v28 = v15;
    double v27 = v0;
    double v17 = v24;
    double v16 = v5;
    const std::vector<double> v10 { v8, v18, v22, v17 };
    const std::vector<double> v61 { v27 };
    const std::vector<std::vector<double>> v30 { v61 };
    std::vector<double> v40 = v10;
    std::vector<double> v41 = v61;
    std::vector<double> v58 = v40;
    const s0 v31(v16, v30);
    std::vector<std::vector<double>> v76 = v30;
    v76[0] = v41;
    const std::vector<std::vector<double>> v110 = v31.p1;
    const std::vector<double> v46 = v110[0];
    double v95 = v3;
    const double v102 = v58[1];
    const std::vector<std::vector<double>> v81 = v31.p1;
    const std::vector<double> v112 = v76[0];
    v40 = v10;
    std::vector<std::vector<double>> v94 = v81;
    s0 v173 = v31;
    v173.p0 = v5;
    std::vector<double> v84 = v112;
    const double v86 = v46[0];
    v58[2] = v20;
    const std::vector<std::vector<double>> v77 = v173.p1;
    v173.p1 = v94;
    const double v75 = v173.p0;
    v84[0] = v75;
    v58[2] = v86;
    s0 v140 = v31;
    v140.p1 = v77;
    v140.p1 = v76;
    v41[0] = v28;
    v94 = v81;
    v76[0] = v84;
    v140.p0 = v102;
    v41[0] = v95;
    v40[3] = v95;
    v41[0] = v2;
    const double v330 = v140.p0;
    return v330;
  }
  double f53(const double &v0, const s7 &v1, const s3 &v2) {
    const double v26 = f69(v0);
    double v131 = v26;
    const double v86 = f69(v131);
    const double v79 = f69(v86);
    const double v95 = f69(v86);
    const double v81 = f69(v95);
    const std::vector<double> v107 { v81, v79, v79, v0, v26, v86, v0 };
    const double v103 = v107[1];
    return v103;
  }
  s7 f51(const s7 &v0, const s5 &v1) {
    s7 v4 = v0;
    s7 v12 = v4;
    s7 v30 = v12;
    return v30;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const s5 &v1, const s8 &v2, const s7 &v3, const s8 &v4, const s0 &v5, const std::vector<s0> &v6, const double &v7) {
    s7 v18 = v3;
    double v24 = v7;
    const s0 v17 = v1.p2;
    const double v46 = v17.p0;
    const s7 v93 = f51(v18, v1);
    const double v37 = v24 - v7;
    const s3 v66 = v1.p0;
    const double v33 = f53(v24, v93, v66);
    const double v169 = v33 + v37;
    const double v87 = v7 * v169;
    const double v110 = v87 * v46;
    v24 = v37;
    v18 = v3;
    return v110;
  }
  int main() {
    s1 v0({ { 0.0, { { 1.0 } } }, { 2.0, { { 3.0 } } } });
    s5 v1({ { { { { 4.0, { { 5.0 } } }, { 6.0, { { 7.0 } } } }, { { 8.0, { { 9.0 } } }, { 10.0, { { 11.0 } } } } }, { { 12.0, { { 13.0 } } }, { 14.0, { { 15.0 } } } }, { { 16.0, { { 17.0 } } }, { 18.0, { { 19.0 } } } } }, { { { { 20.0, { { 21.0 } } }, { 22.0, { { 23.0 } } } }, { { 24.0, { { 25.0 } } }, { 26.0, { { 27.0 } } } } } }, { 28.0, { { 29.0 } } } });
    s8 v2({ { { { { { { { 30.0, { { 31.0 } } }, { 32.0, { { 33.0 } } } }, { { 34.0, { { 35.0 } } }, { 36.0, { { 37.0 } } } } }, { { 38.0, { { 39.0 } } }, { 40.0, { { 41.0 } } } }, { { 42.0, { { 43.0 } } }, { 44.0, { { 45.0 } } } } }, { { { { 46.0, { { 47.0 } } }, { 48.0, { { 49.0 } } } }, { { 50.0, { { 51.0 } } }, { 52.0, { { 53.0 } } } } } }, { 54.0, { { 55.0 } } } } } }, { { { { { 56.0, { { 57.0 } } }, { 58.0, { { 59.0 } } } }, { { 60.0, { { 61.0 } } }, { 62.0, { { 63.0 } } } } }, { { 64.0, { { 65.0 } } }, { 66.0, { { 67.0 } } } }, { { 68.0, { { 69.0 } } }, { 70.0, { { 71.0 } } } } }, { { { { 72.0, { { 73.0 } } }, { 74.0, { { 75.0 } } } }, { { 76.0, { { 77.0 } } }, { 78.0, { { 79.0 } } } } } }, { 80.0, { { 81.0 } } } } });
    s7 v3({ { { { { { { { { { { 82.0, { { 83.0 } } }, { 84.0, { { 85.0 } } } }, { { 86.0, { { 87.0 } } }, { 88.0, { { 89.0 } } } } }, { { 90.0, { { 91.0 } } }, { 92.0, { { 93.0 } } } }, { { 94.0, { { 95.0 } } }, { 96.0, { { 97.0 } } } } }, { { { { 98.0, { { 99.0 } } }, { 100.0, { { 101.0 } } } }, { { 102.0, { { 103.0 } } }, { 104.0, { { 105.0 } } } } } }, { 106.0, { { 107.0 } } } } }, { { { { { { 108.0, { { 109.0 } } }, { 110.0, { { 111.0 } } } }, { { 112.0, { { 113.0 } } }, { 114.0, { { 115.0 } } } } }, { { 116.0, { { 117.0 } } }, { 118.0, { { 119.0 } } } }, { { 120.0, { { 121.0 } } }, { 122.0, { { 123.0 } } } } }, { { { { 124.0, { { 125.0 } } }, { 126.0, { { 127.0 } } } }, { { 128.0, { { 129.0 } } }, { 130.0, { { 131.0 } } } } } }, { 132.0, { { 133.0 } } } } } }, { { { { 134.0, { { 135.0 } } }, { 136.0, { { 137.0 } } } }, { { 138.0, { { 139.0 } } }, { 140.0, { { 141.0 } } } } } } } } }, { { { { 142.0, { { 143.0 } } }, { 144.0, { { 145.0 } } } }, { { 146.0, { { 147.0 } } }, { 148.0, { { 149.0 } } } } }, { { { 150.0, { { 151.0 } } }, { 152.0, { { 153.0 } } } }, { { 154.0, { { 155.0 } } }, { 156.0, { { 157.0 } } } } }, { { { 158.0, { { 159.0 } } }, { 160.0, { { 161.0 } } } }, { { 162.0, { { 163.0 } } }, { 164.0, { { 165.0 } } } } } }, { { 166.0, { { 167.0 } } }, { 168.0, { { 169.0 } } }, { 170.0, { { 171.0 } } } }, { { { { 172.0, { { 173.0 } } }, { { 174.0, { { 175.0 } } }, { 176.0, { { 177.0 } } } } } }, { { { 178.0, { { 179.0 } } }, { { 180.0, { { 181.0 } } }, { 182.0, { { 183.0 } } } } } }, { { { 184.0, { { 185.0 } } }, { { 186.0, { { 187.0 } } }, { 188.0, { { 189.0 } } } } } } }, { { { { { { { 190.0, { { 191.0 } } }, { 192.0, { { 193.0 } } } }, { { 194.0, { { 195.0 } } }, { 196.0, { { 197.0 } } } } }, { { 198.0, { { 199.0 } } }, { 200.0, { { 201.0 } } } }, { { 202.0, { { 203.0 } } }, { 204.0, { { 205.0 } } } } }, { { { { 206.0, { { 207.0 } } }, { 208.0, { { 209.0 } } } }, { { 210.0, { { 211.0 } } }, { 212.0, { { 213.0 } } } } } }, { 214.0, { { 215.0 } } } } }, { { { { { { 216.0, { { 217.0 } } }, { 218.0, { { 219.0 } } } }, { { 220.0, { { 221.0 } } }, { 222.0, { { 223.0 } } } } }, { { 224.0, { { 225.0 } } }, { 226.0, { { 227.0 } } } }, { { 228.0, { { 229.0 } } }, { 230.0, { { 231.0 } } } } }, { { { { 232.0, { { 233.0 } } }, { 234.0, { { 235.0 } } } }, { { 236.0, { { 237.0 } } }, { 238.0, { { 239.0 } } } } } }, { 240.0, { { 241.0 } } } } } } });
    s8 v4({ { { { { { { { 242.0, { { 243.0 } } }, { 244.0, { { 245.0 } } } }, { { 246.0, { { 247.0 } } }, { 248.0, { { 249.0 } } } } }, { { 250.0, { { 251.0 } } }, { 252.0, { { 253.0 } } } }, { { 254.0, { { 255.0 } } }, { 256.0, { { 257.0 } } } } }, { { { { 258.0, { { 259.0 } } }, { 260.0, { { 261.0 } } } }, { { 262.0, { { 263.0 } } }, { 264.0, { { 265.0 } } } } } }, { 266.0, { { 267.0 } } } } } }, { { { { { 268.0, { { 269.0 } } }, { 270.0, { { 271.0 } } } }, { { 272.0, { { 273.0 } } }, { 274.0, { { 275.0 } } } } }, { { 276.0, { { 277.0 } } }, { 278.0, { { 279.0 } } } }, { { 280.0, { { 281.0 } } }, { 282.0, { { 283.0 } } } } }, { { { { 284.0, { { 285.0 } } }, { 286.0, { { 287.0 } } } }, { { 288.0, { { 289.0 } } }, { 290.0, { { 291.0 } } } } } }, { 292.0, { { 293.0 } } } } });
    s0 v5({ 294.0, { { 295.0 } } });
    std::vector<s0> v6({ { 296.0, { { 297.0 } } }, { 298.0, { { 299.0 } } } });
    double v7(300.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4, v5, v6, v7);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
