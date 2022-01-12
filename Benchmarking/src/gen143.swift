  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s3 {
    var p0: s0
    var p1: s1
  }
  func f43(_ v0: s3) -> s3 {
    let v5: [s3] = [v0]
    let v3: s3 = v5[0]
    let v12: s3 = v5[0]
    var v8: [s3] = v5
    v8[0] = v12
    v8[0] = v0
    v8[0] = v3
    var v25: [s3] = v8
    var v188: [s3] = v25
    let v145: s3 = v188[0]
    return v145
  }
  @inline(never)
  func f0(_ v0: [[s3]], _ v1: Double) -> Double {
    let v4: [s3] = v0[0]
    let v5: s3 = v4[0]
    let v12: [Double] = [v1]
    let v6: s3 = f43(v5)
    let v8: Double = v12[0]
    let v14: s0 = v6.p0
    var v15: [Double] = v12
    let v9: [[Double]] = v14.p1
    let v21: [Double] = v9[2]
    let v23: Double = v21[0]
    v15[0] = v23
    let v29: Double = v8 + v8
    v15 = v21
    var v58: [Double] = v21
    let v43: Double = v58[0]
    v58[0] = v8
    v58[0] = v29
    let v105: Double = v15[0]
    let v118: Double = v23 + v105
    v15[0] = v29
    let v185: Double = v118 / v43
    return v185
  }
  func benchmark() {
    let v0: [[s3]] = [[s3(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: s1(p0: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), p1: [s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])]))], [s3(p0: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]), p1: s1(p0: s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]]), p1: [s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])]))]]
    let v1: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
