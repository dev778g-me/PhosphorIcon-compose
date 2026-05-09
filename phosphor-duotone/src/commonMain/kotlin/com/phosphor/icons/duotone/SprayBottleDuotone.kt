package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.SprayBottleDuotone: ImageVector
    get() {
        if (_SprayBottleDuotone != null) {
            return _SprayBottleDuotone!!
        }
        _SprayBottleDuotone = ImageVector.Builder(
            name = "Duotone.SprayBottleDuotone",
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
                moveTo(160f, 72f)
                horizontalLineToRelative(0f)
                arcToRelative(263.14f, 263.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 139.47f)
                verticalLineTo(224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(167.38f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, -25f)
                lineToRelative(16f, -12.78f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -25f)
                verticalLineTo(72f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 72f)
                horizontalLineTo(200f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, -48f)
                horizontalLineTo(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineTo(80f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 72f)
                horizontalLineToRelative(0f)
                arcToRelative(263.14f, 263.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 139.47f)
                verticalLineTo(224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(167.38f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, -25f)
                lineToRelative(16f, -12.78f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -25f)
                verticalLineTo(72f)
            }
        }.build()

        return _SprayBottleDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _SprayBottleDuotone: ImageVector? = null
