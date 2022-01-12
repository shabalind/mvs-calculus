  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s3 {
    var p0: s0
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [[s3]], _ v1: Double) -> Double {
    let v5: [s3] = v0[0]
    let v2: s3 = v5[0]
    let v7: s0 = v2.p1
    let v4: [[Double]] = v7.p0
    let v10: s0 = v2.p1
    let v19: [[Double]] = v10.p0
    let v13: s3 = v5[0]
    let v8: s0 = v13.p0
    let v14: [[Double]] = v8.p1
    let v23: [[Double]] = v7.p2
    let v27: s0 = s0(p0: v19, p1: v14, p2: v4)
    let v50: [[Double]] = v27.p0
    let v38: [[[Double]]] = [v23, v19, v50]
    let v59: [[Double]] = v38[2]
    let v122: [Double] = v59[1]
    let v279: Double = v122[0]
    return v279
  }
  func benchmark() {
    let v0: [[s3]] = [[s3(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]], p2: [[5.0], [6.0]]), p1: s0(p0: [[7.0], [8.0]], p1: [[9.0], [10.0], [11.0]], p2: [[12.0], [13.0]]))]]
    let v1: Double = 14.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 14.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
