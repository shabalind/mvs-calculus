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
    std::vector<std::vector<s0>> p0;
    s1 p1;
    s2(std::vector<std::vector<s0>> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    s0 p1;
    s3(s2 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s0 p0;
    std::vector<std::vector<s3>> p1;
    s5(s0 v0, std::vector<std::vector<s3>> v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s1 p0;
    s5 p1;
    s6(s1 v0, s5 v1): p0(v0), p1(v1) { }
  };
  s0 f7(const s0 &v0) {
    const std::vector<std::vector<double>> v5 = v0.p1;
    const std::vector<std::vector<double>> v4 = v0.p0;
    const std::vector<std::vector<double>> v1 = v0.p1;
    const std::vector<std::vector<double>> v8 = v0.p0;
    std::vector<std::vector<double>> v14 = v8;
    const std::vector<std::vector<double>> v15 = v0.p0;
    const s0 v35(v4, v1);
    std::vector<std::vector<double>> v53 = v1;
    s0 v26 = v35;
    v26.p0 = v5;
    v26.p0 = v53;
    v26.p0 = v15;
    v26.p1 = v14;
    v26.p1 = v15;
    return v26;
  }
  s0 f6(const s3 &v0, const s0 &v1) {
    s0 v6 = v1;
    s0 v7 = v6;
    const std::vector<std::vector<double>> v9 = v6.p0;
    const std::vector<double> v8 = v9[1];
    std::vector<std::vector<double>> v11 = v9;
    const std::vector<std::vector<double>> v13 = v6.p1;
    v6.p0 = v9;
    std::vector<double> v14 = v8;
    v7.p0 = v9;
    v11[2] = v14;
    const std::vector<std::vector<double>> v20 = v7.p0;
    v11[0] = v8;
    const std::vector<std::vector<std::vector<double>>> v24 { v13 };
    v11[0] = v8;
    const s0 v34(v11, v11);
    const std::vector<double> v50 = v13[1];
    const double v29 = v50[0];
    v6.p1 = v20;
    std::vector<std::vector<std::vector<double>>> v38 = v24;
    v11[2] = v14;
    v14[0] = v29;
    const std::vector<std::vector<double>> v136 = v38[0];
    v6.p0 = v9;
    v6.p1 = v9;
    const std::vector<double> v94 = v136[2];
    v11[2] = v94;
    return v34;
  }
  s0 f4(const s0 &v0) {
    const s0 v4 = f7(v0);
    const std::vector<std::vector<double>> v6 = v0.p0;
    const std::vector<std::vector<double>> v5 = v4.p1;
    s0 v3 = v0;
    const s0 v1 = f7(v4);
    const std::vector<std::vector<double>> v11 = v0.p1;
    const std::vector<std::vector<double>> v8 = v0.p0;
    s0 v13 = v0;
    const s0 v15 = f7(v3);
    const std::vector<double> v23 = v11[1];
    const s0 v9 = f7(v15);
    v13.p1 = v8;
    v13.p0 = v8;
    v13 = v1;
    const std::vector<std::vector<double>> v19 = v1.p1;
    const double v37 = v23[0];
    double v25 = v37;
    const s0 v16 = f7(v3);
    std::vector<std::vector<double>> v35 = v5;
    v13.p1 = v5;
    std::vector<double> v26 = v23;
    std::vector<double> v30 = v26;
    const s0 v24 = f7(v3);
    v13 = v9;
    const std::vector<std::vector<double>> v40 = v0.p1;
    std::vector<std::vector<double>> v42 = v35;
    const std::vector<s0> v56 { v4 };
    const s0 v31 = v56[0];
    const s0 v38 = f7(v15);
    const std::vector<std::vector<double>> v69 = v38.p0;
    v3.p0 = v69;
    v3.p1 = v8;
    const s0 v53 = f7(v24);
    v30[0] = v25;
    const std::vector<std::vector<double>> v54 = v53.p0;
    s0 v58 = v13;
    std::vector<std::vector<double>> v50 = v40;
    const std::vector<std::vector<double>> v47 = v31.p1;
    v13.p1 = v47;
    v42 = v50;
    const s0 v73 = f7(v58);
    const std::vector<std::vector<double>> v75 = v58.p0;
    v3 = v16;
    v26[0] = v37;
    const std::vector<double> v187 = v54[2];
    v13.p0 = v6;
    v3.p1 = v19;
    v50[0] = v30;
    v42[0] = v187;
    v42 = v75;
    v58.p1 = v42;
    const s0 v149 = f7(v73);
    v13.p0 = v8;
    v3.p0 = v11;
    return v149;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s6>> &v0, const s5 &v1, const s2 &v2, const double &v3) {
    const std::vector<s6> v8 = v0[0];
    const s6 v6 = v8[0];
    const s5 v13 = v6.p1;
    const std::vector<std::vector<s3>> v12 = v13.p1;
    const std::vector<s3> v33 = v12[0];
    const std::vector<std::vector<s3>> v10 = v1.p1;
    s6 v24 = v6;
    const s1 v49 = v24.p0;
    s5 v79 = v1;
    const std::vector<s0> v19 = v49.p1;
    const s0 v23 = v79.p0;
    const s3 v61 = v33[0];
    const s0 v41 = v19[0];
    const s0 v65 = f6(v61, v23);
    v79.p1 = v10;
    v79.p1 = v10;
    const s0 v48 = f4(v41);
    v79.p0 = v48;
    const std::vector<std::vector<double>> v164 = v65.p0;
    const std::vector<double> v139 = v164[0];
    const double v103 = v139[0];
    return v103;
  }
  int main() {
    std::vector<std::vector<s6>> v0({ { { { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } } }, { { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } }, { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } }, { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } }, { { { { { { { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } } }, { { { { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 }, { 40.0 }, { 41.0 } } } }, { { { { 42.0 }, { 43.0 }, { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } } }, { { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 }, { 52.0 }, { 53.0 } } }, { { { 54.0 }, { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } } } }, { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 }, { 64.0 }, { 65.0 } } } } }, { { { { { { { { 66.0 }, { 67.0 }, { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } } } }, { { { { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 }, { 76.0 }, { 77.0 } } } }, { { { { 78.0 }, { 79.0 }, { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } } } }, { { { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 }, { 88.0 }, { 89.0 } } }, { { { 90.0 }, { 91.0 }, { 92.0 } }, { { 93.0 }, { 94.0 }, { 95.0 } } } } } }, { { { 96.0 }, { 97.0 }, { 98.0 } }, { { 99.0 }, { 100.0 }, { 101.0 } } } } } } } } }, { { { { { { { { 102.0 }, { 103.0 }, { 104.0 } }, { { 105.0 }, { 106.0 }, { 107.0 } } } }, { { { { 108.0 }, { 109.0 }, { 110.0 } }, { { 111.0 }, { 112.0 }, { 113.0 } } } } }, { { { { 114.0 }, { 115.0 }, { 116.0 } }, { { 117.0 }, { 118.0 }, { 119.0 } } }, { { { 120.0 }, { 121.0 }, { 122.0 } }, { { 123.0 }, { 124.0 }, { 125.0 } } } } }, { { { { 126.0 }, { 127.0 }, { 128.0 } }, { { 129.0 }, { 130.0 }, { 131.0 } } }, { { { { { { { { { 132.0 }, { 133.0 }, { 134.0 } }, { { 135.0 }, { 136.0 }, { 137.0 } } } } }, { { { { { { 138.0 }, { 139.0 }, { 140.0 } }, { { 141.0 }, { 142.0 }, { 143.0 } } } }, { { { { 144.0 }, { 145.0 }, { 146.0 } }, { { 147.0 }, { 148.0 }, { 149.0 } } } } }, { { { { 150.0 }, { 151.0 }, { 152.0 } }, { { 153.0 }, { 154.0 }, { 155.0 } } }, { { { 156.0 }, { 157.0 }, { 158.0 } }, { { 159.0 }, { 160.0 }, { 161.0 } } } } } }, { { { 162.0 }, { 163.0 }, { 164.0 } }, { { 165.0 }, { 166.0 }, { 167.0 } } } } }, { { { { { { { { 168.0 }, { 169.0 }, { 170.0 } }, { { 171.0 }, { 172.0 }, { 173.0 } } } } }, { { { { { { 174.0 }, { 175.0 }, { 176.0 } }, { { 177.0 }, { 178.0 }, { 179.0 } } } }, { { { { 180.0 }, { 181.0 }, { 182.0 } }, { { 183.0 }, { 184.0 }, { 185.0 } } } } }, { { { { 186.0 }, { 187.0 }, { 188.0 } }, { { 189.0 }, { 190.0 }, { 191.0 } } }, { { { 192.0 }, { 193.0 }, { 194.0 } }, { { 195.0 }, { 196.0 }, { 197.0 } } } } } }, { { { 198.0 }, { 199.0 }, { 200.0 } }, { { 201.0 }, { 202.0 }, { 203.0 } } } } } } } } } });
    s5 v1({ { { { 204.0 }, { 205.0 }, { 206.0 } }, { { 207.0 }, { 208.0 }, { 209.0 } } }, { { { { { { { { { 210.0 }, { 211.0 }, { 212.0 } }, { { 213.0 }, { 214.0 }, { 215.0 } } } } }, { { { { { { 216.0 }, { 217.0 }, { 218.0 } }, { { 219.0 }, { 220.0 }, { 221.0 } } } }, { { { { 222.0 }, { 223.0 }, { 224.0 } }, { { 225.0 }, { 226.0 }, { 227.0 } } } } }, { { { { 228.0 }, { 229.0 }, { 230.0 } }, { { 231.0 }, { 232.0 }, { 233.0 } } }, { { { 234.0 }, { 235.0 }, { 236.0 } }, { { 237.0 }, { 238.0 }, { 239.0 } } } } } }, { { { 240.0 }, { 241.0 }, { 242.0 } }, { { 243.0 }, { 244.0 }, { 245.0 } } } } }, { { { { { { { { 246.0 }, { 247.0 }, { 248.0 } }, { { 249.0 }, { 250.0 }, { 251.0 } } } } }, { { { { { { 252.0 }, { 253.0 }, { 254.0 } }, { { 255.0 }, { 256.0 }, { 257.0 } } } }, { { { { 258.0 }, { 259.0 }, { 260.0 } }, { { 261.0 }, { 262.0 }, { 263.0 } } } } }, { { { { 264.0 }, { 265.0 }, { 266.0 } }, { { 267.0 }, { 268.0 }, { 269.0 } } }, { { { 270.0 }, { 271.0 }, { 272.0 } }, { { 273.0 }, { 274.0 }, { 275.0 } } } } } }, { { { 276.0 }, { 277.0 }, { 278.0 } }, { { 279.0 }, { 280.0 }, { 281.0 } } } } } } });
    s2 v2({ { { { { { 282.0 }, { 283.0 }, { 284.0 } }, { { 285.0 }, { 286.0 }, { 287.0 } } } } }, { { { { { { 288.0 }, { 289.0 }, { 290.0 } }, { { 291.0 }, { 292.0 }, { 293.0 } } } }, { { { { 294.0 }, { 295.0 }, { 296.0 } }, { { 297.0 }, { 298.0 }, { 299.0 } } } } }, { { { { 300.0 }, { 301.0 }, { 302.0 } }, { { 303.0 }, { 304.0 }, { 305.0 } } }, { { { 306.0 }, { 307.0 }, { 308.0 } }, { { 309.0 }, { 310.0 }, { 311.0 } } } } } });
    double v3(312.0);
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
