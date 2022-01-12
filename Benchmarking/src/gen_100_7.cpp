  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<double> p3;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<double> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<s1> p1;
    std::vector<s0> p2;
    s0 p3;
    std::vector<std::vector<s0>> p4;
    s2(std::vector<s0> v0, std::vector<s1> v1, std::vector<s0> v2, s0 v3, std::vector<std::vector<s0>> v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  struct s5 {
    s2 p0;
    std::vector<std::vector<s1>> p1;
    s5(s2 v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s1 p0;
    s5 p1;
    s6(s1 v0, s5 v1): p0(v0), p1(v1) { }
  };
  s0 f52(const s0 &v0) {
    const std::vector<double> v2 = v0.p3;
    const double v6 = v2[1];
    double v5 = v6;
    s0 v8 = v0;
    std::vector<double> v4 = v2;
    const double v3 = v4[2];
    double v10 = v6;
    v4[1] = v10;
    v4[1] = v5;
    s0 v11 = v0;
    s0 v13 = v0;
    s0 v12 = v8;
    s0 v14 = v8;
    const double v23 = v2[2];
    const std::vector<std::vector<double>> v25 = v8.p1;
    std::vector<std::vector<double>> v17 = v25;
    const std::vector<double> v19 = v25[1];
    const std::vector<std::vector<double>> v16 = v11.p0;
    std::vector<double> v42 = v19;
    v17[1] = v42;
    std::vector<std::vector<double>> v20 = v16;
    std::vector<double> v18 = v42;
    v11.p1 = v25;
    v42[0] = v5;
    const std::vector<std::vector<double>> v22 = v14.p0;
    const std::vector<std::vector<std::vector<double>>> v27 { v17 };
    v4[1] = v3;
    const std::vector<std::vector<double>> v21 = v0.p1;
    std::vector<std::vector<double>> v58 = v25;
    v4[1] = v10;
    v14.p1 = v17;
    std::vector<double> v31 = v19;
    v12.p0 = v20;
    const std::vector<double> v55 = v13.p3;
    v20[0] = v42;
    const std::vector<std::vector<double>> v32 = v0.p2;
    std::vector<std::vector<double>> v127 = v25;
    v58[0] = v31;
    const std::vector<double> v36 = v32[1];
    const std::vector<std::vector<double>> v30 = v13.p0;
    std::vector<double> v98 = v4;
    const std::vector<std::vector<double>> v40 = v12.p1;
    const std::vector<std::vector<double>> v54 = v13.p2;
    const std::vector<double> v62 = v22[0];
    std::vector<std::vector<double>> v57 = v21;
    v11.p3 = v55;
    const std::vector<std::vector<double>> v79 = v27[0];
    const std::vector<std::vector<double>> v103 = v14.p0;
    const s0 v100(v103, v54, v40, v4);
    const std::vector<std::vector<double>> v75 = v13.p0;
    v11.p0 = v20;
    const std::vector<std::vector<double>> v80 = v0.p2;
    v8.p3 = v98;
    const std::vector<s0> v118 { v11, v12, v100, v14, v100 };
    const s0 v119 = v118[0];
    const std::vector<std::vector<double>> v122 = v0.p2;
    const s0 v68 = v118[4];
    v13.p2 = v58;
    v31[0] = v23;
    const std::vector<double> v161 = v68.p3;
    v11.p0 = v75;
    v13.p1 = v122;
    const std::vector<std::vector<double>> v108 = v119.p2;
    v58[1] = v62;
    const std::vector<std::vector<double>> v84 = v13.p0;
    const s0 v60(v20, v127, v79, v161);
    const std::vector<double> v153 = v57[0];
    v20[0] = v18;
    v8.p0 = v20;
    v14.p2 = v54;
    v12.p2 = v108;
    v8.p0 = v30;
    v58[1] = v36;
    v14.p1 = v80;
    v127[0] = v153;
    v13.p0 = v84;
    v20[0] = v31;
    return v60;
  }
  s0 f34(const s0 &v0) {
    s0 v8 = v0;
    const std::vector<std::vector<double>> v6 = v8.p1;
    v8.p1 = v6;
    s0 v1 = v8;
    const std::vector<std::vector<double>> v4 = v0.p2;
    v1.p1 = v6;
    v8.p1 = v4;
    s0 v7 = v8;
    const s0 v9 = f52(v1);
    const s0 v14 = f52(v7);
    const s0 v13 = f52(v8);
    const std::vector<std::vector<double>> v18 = v7.p1;
    const std::vector<std::vector<double>> v23 = v13.p0;
    const std::vector<std::vector<double>> v34 = v9.p1;
    const s0 v28 = f52(v14);
    const std::vector<double> v48 = v28.p3;
    std::vector<std::vector<double>> v73 = v23;
    const s0 v36(v73, v18, v34, v48);
    return v36;
  }
  std::vector<s0> f22(const std::vector<s0> &v0) {
    const s0 v4 = v0[0];
    const s0 v1 = v0[0];
    const s0 v7 = v0[0];
    const s0 v11 = f34(v4);
    std::vector<s0> v10 = v0;
    v10[0] = v7;
    v10[0] = v11;
    const s0 v29 = f52(v1);
    std::vector<s0> v35 = v10;
    v35[0] = v29;
    v35[0] = v1;
    return v35;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const s6 &v1, const std::vector<s0> &v2, const double &v3) {
    const std::vector<s0> v6 = f22(v2);
    const s0 v5 = v6[0];
    const s0 v13 = f52(v5);
    s0 v15 = v13;
    std::vector<s0> v18 = v2;
    v18[0] = v5;
    v18 = v6;
    v18[0] = v13;
    const s0 v41 = v18[0];
    const s0 v56 = f52(v41);
    s0 v85 = v15;
    const std::vector<std::vector<double>> v92 = v85.p0;
    v15 = v13;
    s0 v214 = v56;
    const s0 v90 = f34(v214);
    const std::vector<std::vector<double>> v89 = v214.p2;
    const std::vector<double> v137 = v92[0];
    const double v133 = v137[0];
    v214.p2 = v89;
    const std::vector<double> v105 = v214.p3;
    const double v129 = v3 - v133;
    v15.p3 = v105;
    v18[0] = v90;
    return v129;
  }
  int main() {
    std::vector<s2> v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } }, { 5.0, 6.0, 7.0 } }, { { { 8.0 } }, { { 9.0 }, { 10.0 } }, { { 11.0 }, { 12.0 } }, { 13.0, 14.0, 15.0 } } }, { { { { { { { 16.0 } }, { { 17.0 }, { 18.0 } }, { { 19.0 }, { 20.0 } }, { 21.0, 22.0, 23.0 } } } }, { { { 24.0 } }, { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 } }, { 29.0, 30.0, 31.0 } } } }, { { { { 32.0 } }, { { 33.0 }, { 34.0 } }, { { 35.0 }, { 36.0 } }, { 37.0, 38.0, 39.0 } } }, { { { 40.0 } }, { { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 } }, { 45.0, 46.0, 47.0 } }, { { { { { 48.0 } }, { { 49.0 }, { 50.0 } }, { { 51.0 }, { 52.0 } }, { 53.0, 54.0, 55.0 } } }, { { { { 56.0 } }, { { 57.0 }, { 58.0 } }, { { 59.0 }, { 60.0 } }, { 61.0, 62.0, 63.0 } } }, { { { { 64.0 } }, { { 65.0 }, { 66.0 } }, { { 67.0 }, { 68.0 } }, { 69.0, 70.0, 71.0 } } } } }, { { { { { 72.0 } }, { { 73.0 }, { 74.0 } }, { { 75.0 }, { 76.0 } }, { 77.0, 78.0, 79.0 } }, { { { 80.0 } }, { { 81.0 }, { 82.0 } }, { { 83.0 }, { 84.0 } }, { 85.0, 86.0, 87.0 } } }, { { { { { { { 88.0 } }, { { 89.0 }, { 90.0 } }, { { 91.0 }, { 92.0 } }, { 93.0, 94.0, 95.0 } } } }, { { { 96.0 } }, { { 97.0 }, { 98.0 } }, { { 99.0 }, { 100.0 } }, { 101.0, 102.0, 103.0 } } } }, { { { { 104.0 } }, { { 105.0 }, { 106.0 } }, { { 107.0 }, { 108.0 } }, { 109.0, 110.0, 111.0 } } }, { { { 112.0 } }, { { 113.0 }, { 114.0 } }, { { 115.0 }, { 116.0 } }, { 117.0, 118.0, 119.0 } }, { { { { { 120.0 } }, { { 121.0 }, { 122.0 } }, { { 123.0 }, { 124.0 } }, { 125.0, 126.0, 127.0 } } }, { { { { 128.0 } }, { { 129.0 }, { 130.0 } }, { { 131.0 }, { 132.0 } }, { 133.0, 134.0, 135.0 } } }, { { { { 136.0 } }, { { 137.0 }, { 138.0 } }, { { 139.0 }, { 140.0 } }, { 141.0, 142.0, 143.0 } } } } } });
    s6 v1({ { { { { { { 144.0 } }, { { 145.0 }, { 146.0 } }, { { 147.0 }, { 148.0 } }, { 149.0, 150.0, 151.0 } } } }, { { { 152.0 } }, { { 153.0 }, { 154.0 } }, { { 155.0 }, { 156.0 } }, { 157.0, 158.0, 159.0 } } }, { { { { { { 160.0 } }, { { 161.0 }, { 162.0 } }, { { 163.0 }, { 164.0 } }, { 165.0, 166.0, 167.0 } }, { { { 168.0 } }, { { 169.0 }, { 170.0 } }, { { 171.0 }, { 172.0 } }, { 173.0, 174.0, 175.0 } } }, { { { { { { { 176.0 } }, { { 177.0 }, { 178.0 } }, { { 179.0 }, { 180.0 } }, { 181.0, 182.0, 183.0 } } } }, { { { 184.0 } }, { { 185.0 }, { 186.0 } }, { { 187.0 }, { 188.0 } }, { 189.0, 190.0, 191.0 } } } }, { { { { 192.0 } }, { { 193.0 }, { 194.0 } }, { { 195.0 }, { 196.0 } }, { 197.0, 198.0, 199.0 } } }, { { { 200.0 } }, { { 201.0 }, { 202.0 } }, { { 203.0 }, { 204.0 } }, { 205.0, 206.0, 207.0 } }, { { { { { 208.0 } }, { { 209.0 }, { 210.0 } }, { { 211.0 }, { 212.0 } }, { 213.0, 214.0, 215.0 } } }, { { { { 216.0 } }, { { 217.0 }, { 218.0 } }, { { 219.0 }, { 220.0 } }, { 221.0, 222.0, 223.0 } } }, { { { { 224.0 } }, { { 225.0 }, { 226.0 } }, { { 227.0 }, { 228.0 } }, { 229.0, 230.0, 231.0 } } } } }, { { { { { { { { 232.0 } }, { { 233.0 }, { 234.0 } }, { { 235.0 }, { 236.0 } }, { 237.0, 238.0, 239.0 } } } }, { { { 240.0 } }, { { 241.0 }, { 242.0 } }, { { 243.0 }, { 244.0 } }, { 245.0, 246.0, 247.0 } } } }, { { { { { { { 248.0 } }, { { 249.0 }, { 250.0 } }, { { 251.0 }, { 252.0 } }, { 253.0, 254.0, 255.0 } } } }, { { { 256.0 } }, { { 257.0 }, { 258.0 } }, { { 259.0 }, { 260.0 } }, { 261.0, 262.0, 263.0 } } } } } } });
    std::vector<s0> v2({ { { { 264.0 } }, { { 265.0 }, { 266.0 } }, { { 267.0 }, { 268.0 } }, { 269.0, 270.0, 271.0 } } });
    double v3(272.0);
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
