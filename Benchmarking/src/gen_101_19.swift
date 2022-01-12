  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s3 {
    var p0: [s1]
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v2: [s1] = v0.p0
    let v3: s1 = v2[0]
    let v7: [s0] = v3.p0
    let v11: s0 = v7[0]
    let v12: s0 = v7[0]
    let v18: [[Double]] = v11.p1
    var v43: Double = v1
    let v34: [Double] = v18[0]
    let v14: [[Double]] = v12.p0
    let v60: Double = v43 - v43
    let v58: [[[Double]]] = [v14, v14, v14, v14, v14, v14]
    let v61: [[Double]] = v58[2]
    var v36: Double = v60
    let v56: Double = v34[0]
    let v53: [Double] = v61[1]
    v43 = v56
    v43 = v36
    let v180: Double = v53[0]
    let v112: Double = v60 + v180
    return v112
  }
  func benchmark() {
    let v0: s3 = s3(p0: [s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]], p2: [[3.0], [4.0], [5.0]]), s0(p0: [[6.0], [7.0]], p1: [[8.0]], p2: [[9.0], [10.0], [11.0]])], p1: [s0(p0: [[12.0], [13.0]], p1: [[14.0]], p2: [[15.0], [16.0], [17.0]])])], p1: s0(p0: [[18.0], [19.0]], p1: [[20.0]], p2: [[21.0], [22.0], [23.0]]))
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
