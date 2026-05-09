package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.DroneDuotone: ImageVector
    get() {
        if (_DroneDuotone != null) {
            return _DroneDuotone!!
        }
        _DroneDuotone = ImageVector.Builder(
            name = "Duotone.DroneDuotone",
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
                moveTo(76f, 76f)
                moveToRelative(-36f, 0f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, 72f, 0f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, -72f, 0f)
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(180f, 76f)
                moveToRelative(-36f, 0f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, 72f, 0f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, -72f, 0f)
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(76f, 180f)
                moveToRelative(-36f, 0f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, 72f, 0f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, -72f, 0f)
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(180f, 180f)
                moveToRelative(-36f, 0f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, 72f, 0f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, -72f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 104f)
                lineTo(184f, 72f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 184f)
                lineTo(104f, 152f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 152f)
                lineTo(184f, 184f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 72f)
                lineTo(104f, 104f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(146.05f, 64f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 110f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 146.05f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, 146.05f, 192f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(110f, 192f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 146.05f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 110f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, 110f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 104f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(-48f)
                close()
            }
        }.build()

        return _DroneDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _DroneDuotone: ImageVector? = null
