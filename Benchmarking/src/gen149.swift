  import Dispatch
  struct s0 {
    var p0: Double
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: s1
  }
  struct s3 {
    var p0: [s1]
    var p1: s2
  }
  struct s4 {
    var p0: s0
    var p1: s1
  }
  struct s5 {
    var p0: [s4]
    var p1: [[s3]]
  }
  func f17(_ v0: s5) -> s5 {
    var v4: s5 = v0
    let v6: [s4] = v4.p0
    let v27: [[s3]] = v0.p1
    v4.p1 = v27
    v4.p0 = v6
    return v4
  }
  func f16(_ v0: s5) -> s5 {
    var v2: s5 = v0
    let v14: [s4] = v0.p0
    let v26: s5 = f17(v2)
    v2 = v0
    v2.p0 = v14
    return v26
  }
  @inline(never)
  func f0(_ v0: [s5], _ v1: Double) -> Double {
    let v6: s5 = v0[0]
    let v2: s5 = f16(v6)
    var v7: s5 = v2
    var v4: s5 = v7
    var v3: s5 = v4
    let v9: [s4] = v3.p0
    let v13: s4 = v9[1]
    let v17: [s4] = v3.p0
    v4.p0 = v17
    v3.p0 = v17
    v3.p0 = v9
    let v21: s0 = v13.p0
    v3.p0 = v17
    v3.p0 = v17
    v3.p0 = v9
    v7.p0 = v9
    var v25: s0 = v21
    var v20: s0 = v25
    let v37: [[Double]] = v20.p1
    v3.p0 = v9
    let v51: [Double] = v37[1]
    var v28: [s4] = v9
    var v125: [s4] = v17
    let v85: Double = v51[0]
    v3.p0 = v28
    v4.p0 = v125
    return v85
  }
  func benchmark() {
    let v0: [s5] = [s5(p0: [s4(p0: s0(p0: 0.0, p1: [[1.0], [2.0]]), p1: s1(p0: s0(p0: 3.0, p1: [[4.0], [5.0]]), p1: s0(p0: 6.0, p1: [[7.0], [8.0]]))), s4(p0: s0(p0: 9.0, p1: [[10.0], [11.0]]), p1: s1(p0: s0(p0: 12.0, p1: [[13.0], [14.0]]), p1: s0(p0: 15.0, p1: [[16.0], [17.0]]))), s4(p0: s0(p0: 18.0, p1: [[19.0], [20.0]]), p1: s1(p0: s0(p0: 21.0, p1: [[22.0], [23.0]]), p1: s0(p0: 24.0, p1: [[25.0], [26.0]])))], p1: [[s3(p0: [s1(p0: s0(p0: 27.0, p1: [[28.0], [29.0]]), p1: s0(p0: 30.0, p1: [[31.0], [32.0]])), s1(p0: s0(p0: 33.0, p1: [[34.0], [35.0]]), p1: s0(p0: 36.0, p1: [[37.0], [38.0]]))], p1: s2(p0: [s0(p0: 39.0, p1: [[40.0], [41.0]])], p1: s1(p0: s0(p0: 42.0, p1: [[43.0], [44.0]]), p1: s0(p0: 45.0, p1: [[46.0], [47.0]]))))]]), s5(p0: [s4(p0: s0(p0: 48.0, p1: [[49.0], [50.0]]), p1: s1(p0: s0(p0: 51.0, p1: [[52.0], [53.0]]), p1: s0(p0: 54.0, p1: [[55.0], [56.0]]))), s4(p0: s0(p0: 57.0, p1: [[58.0], [59.0]]), p1: s1(p0: s0(p0: 60.0, p1: [[61.0], [62.0]]), p1: s0(p0: 63.0, p1: [[64.0], [65.0]]))), s4(p0: s0(p0: 66.0, p1: [[67.0], [68.0]]), p1: s1(p0: s0(p0: 69.0, p1: [[70.0], [71.0]]), p1: s0(p0: 72.0, p1: [[73.0], [74.0]])))], p1: [[s3(p0: [s1(p0: s0(p0: 75.0, p1: [[76.0], [77.0]]), p1: s0(p0: 78.0, p1: [[79.0], [80.0]])), s1(p0: s0(p0: 81.0, p1: [[82.0], [83.0]]), p1: s0(p0: 84.0, p1: [[85.0], [86.0]]))], p1: s2(p0: [s0(p0: 87.0, p1: [[88.0], [89.0]])], p1: s1(p0: s0(p0: 90.0, p1: [[91.0], [92.0]]), p1: s0(p0: 93.0, p1: [[94.0], [95.0]]))))]])]
    let v1: Double = 96.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 96.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
