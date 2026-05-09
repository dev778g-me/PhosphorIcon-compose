package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.ParallelogramDuotone: ImageVector
    get() {
        if (_ParallelogramDuotone != null) {
            return _ParallelogramDuotone!!
        }
        _ParallelogramDuotone = ImageVector.Builder(
            name = "Duotone.ParallelogramDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(24f, 208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.3f, -11.28f)
                lineToRelative(64.8f, -144f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88.81f, 48f)
                horizontalLineTo(232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.3f, 11.28f)
                lineToRelative(-64.8f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.3f, 4.72f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.3f, -11.28f)
                lineToRelative(64.8f, -144f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88.81f, 48f)
                horizontalLineTo(232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.3f, 11.28f)
                lineToRelative(-64.8f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.3f, 4.72f)
                close()
            }
        }.build()

        return _ParallelogramDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ParallelogramDuotone: ImageVector? = null
