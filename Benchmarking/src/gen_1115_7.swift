  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: s0
  }
  struct s3 {
    var p0: s2
    var p1: s2
  }
  func f30(_ v0: s2, _ v1: Double) -> Double {
    let v6: [Double] = [v1, v1, v1]
    var v7: [Double] = v6
    let v3: Double = v6[2]
    let v12: Double = v7[0]
    v7[2] = v12
    v7[2] = v3
    let v11: Double = v7[0]
    v7 = v6
    v7[1] = v11
    var v28: Double = v1
    let v33: Double = v6[1]
    v28 = v33
    let v61: Double = v11 + v12
    v28 = v33
    let v77: Double = v28 + v61
    v7[0] = v61
    return v77
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v2: Double = v1 + v1
    let v11: s2 = v0.p1
    var v4: Double = v2
    let v7: s0 = v11.p0
    let v21: [[Double]] = v7.p0
    let v9: Double = f30(v11, v2)
    let v12: [Double] = v21[0]
    v4 = v9
    var v22: [Double] = v12
    let v17: Double = v22[0]
    v22[0] = v1
    var v29: Double = v17
    v22[0] = v4
    return v29
  }
  func benchmark() {
    let v0: s3 = s3(p0: s2(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]])), p1: s2(p0: s0(p0: [[3.0]], p1: [[4.0], [5.0]])))
    let v1: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
