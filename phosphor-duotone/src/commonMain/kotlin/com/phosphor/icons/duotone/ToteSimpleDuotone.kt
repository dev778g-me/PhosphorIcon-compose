package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.ToteSimpleDuotone: ImageVector
    get() {
        if (_ToteSimpleDuotone != null) {
            return _ToteSimpleDuotone!!
        }
        _ToteSimpleDuotone = ImageVector.Builder(
            name = "Duotone.ToteSimpleDuotone",
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
                moveTo(209.67f, 208f)
                horizontalLineTo(46.33f)
                arcToRelative(8.06f, 8.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -7.07f)
                lineToRelative(-14.25f, -120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8.93f)
                horizontalLineTo(223.92f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8.93f)
                lineToRelative(-14.25f, 120f)
                arcTo(8.06f, 8.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 209.67f, 208f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(209.67f, 208f)
                horizontalLineTo(46.33f)
                arcToRelative(8.06f, 8.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -7.07f)
                lineToRelative(-14.25f, -120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8.93f)
                horizontalLineTo(223.92f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8.93f)
                lineToRelative(-14.25f, 120f)
                arcTo(8.06f, 8.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 209.67f, 208f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 72f)
                verticalLineTo(64f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 0f)
                verticalLineToRelative(8f)
            }
        }.build()

        return _ToteSimpleDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ToteSimpleDuotone: ImageVector? = null
