  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: Double
  }
  struct s1 {
    var p0: s0
    var p1: s0
    var p2: s0
    var p3: [s0]
  }
  struct s3 {
    var p0: s1
    var p1: [[s0]]
  }
  struct s4 {
    var p0: [s3]
    var p1: Double
  }
  struct s7 {
    var p0: [s4]
  }
  struct s11 {
    var p0: [s7]
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s7, _ v1: [s11], _ v2: Double) -> Double {
    let v6: [s4] = v0.p0
    let v4: s4 = v6[0]
    var v5: [s11] = v1
    let v13: s11 = v1[0]
    let v8: s11 = v5[0]
    v5[0] = v13
    let v10: s0 = v8.p1
    let v19: Double = v4.p1
    let v18: Double = v10.p1
    v5[0] = v8
    let v24: s4 = v6[0]
    let v23: Double = v19 / v18
    let v48: Double = v24.p1
    let v124: Double = v19 * v48
    let v178: Double = v124 + v23
    var v118: Double = v178
    return v118
  }
  func benchmark() {
    let v0: s7 = s7(p0: [s4(p0: [s3(p0: s1(p0: s0(p0: [[0.0]], p1: 1.0), p1: s0(p0: [[2.0]], p1: 3.0), p2: s0(p0: [[4.0]], p1: 5.0), p3: [s0(p0: [[6.0]], p1: 7.0)]), p1: [[s0(p0: [[8.0]], p1: 9.0)], [s0(p0: [[10.0]], p1: 11.0)], [s0(p0: [[12.0]], p1: 13.0)]])], p1: 14.0)])
    let v1: [s11] = [s11(p0: [s7(p0: [s4(p0: [s3(p0: s1(p0: s0(p0: [[15.0]], p1: 16.0), p1: s0(p0: [[17.0]], p1: 18.0), p2: s0(p0: [[19.0]], p1: 20.0), p3: [s0(p0: [[21.0]], p1: 22.0)]), p1: [[s0(p0: [[23.0]], p1: 24.0)], [s0(p0: [[25.0]], p1: 26.0)], [s0(p0: [[27.0]], p1: 28.0)]])], p1: 29.0)]), s7(p0: [s4(p0: [s3(p0: s1(p0: s0(p0: [[30.0]], p1: 31.0), p1: s0(p0: [[32.0]], p1: 33.0), p2: s0(p0: [[34.0]], p1: 35.0), p3: [s0(p0: [[36.0]], p1: 37.0)]), p1: [[s0(p0: [[38.0]], p1: 39.0)], [s0(p0: [[40.0]], p1: 41.0)], [s0(p0: [[42.0]], p1: 43.0)]])], p1: 44.0)]), s7(p0: [s4(p0: [s3(p0: s1(p0: s0(p0: [[45.0]], p1: 46.0), p1: s0(p0: [[47.0]], p1: 48.0), p2: s0(p0: [[49.0]], p1: 50.0), p3: [s0(p0: [[51.0]], p1: 52.0)]), p1: [[s0(p0: [[53.0]], p1: 54.0)], [s0(p0: [[55.0]], p1: 56.0)], [s0(p0: [[57.0]], p1: 58.0)]])], p1: 59.0)])], p1: s0(p0: [[60.0]], p1: 61.0))]
    let v2: Double = 62.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 62.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
