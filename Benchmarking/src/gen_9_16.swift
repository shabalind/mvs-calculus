  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: s0
    var p1: Double
  }
  struct s3 {
    var p0: s0
    var p1: s0
  }
  struct s4 {
    var p0: s3
    var p1: s2
  }
  @inline(never)
  func f0(_ v0: [s4], _ v1: Double) -> Double {
    let v2: s4 = v0[0]
    let v5: s2 = v2.p1
    var v7: Double = v1
    var v9: Double = v1
    let v4: s0 = v5.p0
    v9 = v7
    let v12: [[Double]] = v4.p0
    v7 = v1
    let v40: [Double] = v12[1]
    let v24: [[Double]] = v4.p0
    let v50: [Double] = v24[1]
    let v68: Double = v5.p1
    let v26: Double = v50[0]
    var v32: [Double] = v40
    v32[0] = v7
    v32[0] = v9
    v32[0] = v68
    let v81: Double = v32[0]
    v32[0] = v26
    return v81
  }
  func benchmark() {
    let v0: [s4] = [s4(p0: s3(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])), p1: s2(p0: s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]]), p1: 15.0))]
    let v1: Double = 16.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 16.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
