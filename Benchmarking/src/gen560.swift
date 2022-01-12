  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s3 {
    var p0: [[s0]]
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: s2, _ v2: s3, _ v3: Double) -> Double {
    let v13: [Double] = [v3]
    let v12: Double = v13[0]
    let v36: s0 = v1.p1
    let v11: [[Double]] = v36.p0
    var v17: Double = v12
    let v16: Double = v13[0]
    let v25: [Double] = v11[0]
    var v35: [Double] = v25
    let v39: Double = v35[0]
    var v100: Double = v17
    let v104: [Double] = [v100, v16]
    var v74: [Double] = v104
    var v151: [Double] = v74
    v151[0] = v39
    let v407: Double = v151[1]
    return v407
  }
  func benchmark() {
    let v0: s3 = s3(p0: [[s0(p0: [[0.0]])], [s0(p0: [[1.0]])]], p1: s1(p0: s0(p0: [[2.0]]), p1: s0(p0: [[3.0]])))
    let v1: s2 = s2(p0: [[s0(p0: [[4.0]])]], p1: s0(p0: [[5.0]]))
    let v2: s3 = s3(p0: [[s0(p0: [[6.0]])], [s0(p0: [[7.0]])]], p1: s1(p0: s0(p0: [[8.0]]), p1: s0(p0: [[9.0]])))
    let v3: Double = 10.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 10.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
