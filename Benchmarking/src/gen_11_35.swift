  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: s1
    var p1: [s0]
  }
  func f63(_ v0: Double) -> Double {
    var v5: Double = v0
    var v7: Double = v0
    var v4: Double = v5
    var v1: Double = v0
    var v2: Double = v4
    var v8: Double = v2
    var v3: Double = v1
    var v15: Double = v7
    v5 = v8
    var v11: Double = v15
    var v16: Double = v1
    let v33: [Double] = [v7, v3, v11, v16, v1, v5]
    v11 = v0
    var v14: [Double] = v33
    var v21: Double = v3
    v11 = v16
    v14 = v33
    v14[4] = v21
    let v27: Double = v14[2]
    return v27
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: Double) -> Double {
    let v2: Double = v1 + v1
    let v7: Double = f63(v2)
    var v14: Double = v7
    var v15: Double = v7
    let v28: [Double] = [v15, v1, v15, v7, v14, v2, v15]
    var v18: [Double] = v28
    var v56: Double = v14
    v15 = v14
    v18[2] = v2
    let v60: Double = v18[1]
    v56 = v15
    let v113: Double = v56 - v60
    return v113
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: s0(p0: [[3.0]], p1: [[4.0], [5.0]])), p1: [s0(p0: [[6.0]], p1: [[7.0], [8.0]])]), s3(p0: s1(p0: s0(p0: [[9.0]], p1: [[10.0], [11.0]]), p1: s0(p0: [[12.0]], p1: [[13.0], [14.0]])), p1: [s0(p0: [[15.0]], p1: [[16.0], [17.0]])]), s3(p0: s1(p0: s0(p0: [[18.0]], p1: [[19.0], [20.0]]), p1: s0(p0: [[21.0]], p1: [[22.0], [23.0]])), p1: [s0(p0: [[24.0]], p1: [[25.0], [26.0]])])]
    let v1: Double = 27.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 27.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
