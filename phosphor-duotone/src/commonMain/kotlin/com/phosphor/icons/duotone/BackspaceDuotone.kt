package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.BackspaceDuotone: ImageVector
    get() {
        if (_BackspaceDuotone != null) {
            return _BackspaceDuotone!!
        }
        _BackspaceDuotone = ImageVector.Builder(
            name = "Duotone.BackspaceDuotone",
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
                moveTo(61.67f, 204.12f)
                lineTo(16f, 128f)
                lineTo(61.67f, 51.88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 68.53f, 48f)
                horizontalLineTo(216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineTo(200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(68.53f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 61.67f, 204.12f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(61.67f, 204.12f)
                lineTo(16f, 128f)
                lineTo(61.67f, 51.88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 68.53f, 48f)
                horizontalLineTo(216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineTo(200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(68.53f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 61.67f, 204.12f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 104f)
                lineTo(112f, 152f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 152f)
                lineTo(112f, 104f)
            }
        }.build()

        return _BackspaceDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _BackspaceDuotone: ImageVector? = null
