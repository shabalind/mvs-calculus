  import Dispatch
  struct s0 {
    var p0: Double
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s2 {
    var p0: [s1]
    var p1: [s0]
  }
  struct s3 {
    var p0: [[s1]]
    var p1: [[s0]]
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: [s2], _ v2: Double) -> Double {
    let v6: s3 = v0[0]
    let v17: [[s1]] = v6.p0
    let v8: [s1] = v17[0]
    let v15: s3 = v0[0]
    let v18: [[s0]] = v15.p1
    let v27: [s0] = v18[0]
    let v32: s1 = v8[0]
    var v43: [s0] = v27
    let v61: s0 = v43[0]
    let v96: [s0] = v32.p1
    v43[0] = v61
    var v98: [s0] = v96
    let v51: s0 = v98[0]
    let v113: [[Double]] = v51.p1
    let v75: [Double] = v113[1]
    v98 = v43
    let v165: Double = v75[0]
    return v165
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: [[s1(p0: [s0(p0: 0.0, p1: [[1.0], [2.0]]), s0(p0: 3.0, p1: [[4.0], [5.0]])], p1: [s0(p0: 6.0, p1: [[7.0], [8.0]])])]], p1: [[s0(p0: 9.0, p1: [[10.0], [11.0]])], [s0(p0: 12.0, p1: [[13.0], [14.0]])]])]
    let v1: [s2] = [s2(p0: [s1(p0: [s0(p0: 15.0, p1: [[16.0], [17.0]]), s0(p0: 18.0, p1: [[19.0], [20.0]])], p1: [s0(p0: 21.0, p1: [[22.0], [23.0]])])], p1: [s0(p0: 24.0, p1: [[25.0], [26.0]]), s0(p0: 27.0, p1: [[28.0], [29.0]])]), s2(p0: [s1(p0: [s0(p0: 30.0, p1: [[31.0], [32.0]]), s0(p0: 33.0, p1: [[34.0], [35.0]])], p1: [s0(p0: 36.0, p1: [[37.0], [38.0]])])], p1: [s0(p0: 39.0, p1: [[40.0], [41.0]]), s0(p0: 42.0, p1: [[43.0], [44.0]])])]
    let v2: Double = 45.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 45.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
