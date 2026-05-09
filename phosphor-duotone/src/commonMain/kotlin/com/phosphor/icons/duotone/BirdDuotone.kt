package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.BirdDuotone: ImageVector
    get() {
        if (_BirdDuotone != null) {
            return _BirdDuotone!!
        }
        _BirdDuotone = ImageVector.Builder(
            name = "Duotone.BirdDuotone",
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
                moveTo(104f, 99.52f)
                verticalLineTo(76.89f)
                curveToRelative(0f, -28.77f, 23f, -52.75f, 51.74f, -52.89f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 50.59f, 38.89f)
                lineTo(232f, 80f)
                lineTo(208f, 96f)
                verticalLineToRelative(24f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -96f, 96f)
                horizontalLineTo(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.25f, -13f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(164f, 68f)
                moveToRelative(-12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 99.52f)
                verticalLineTo(76.89f)
                curveToRelative(0f, -28.77f, 23f, -52.75f, 51.74f, -52.89f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 50.59f, 38.89f)
                lineTo(232f, 80f)
                lineTo(208f, 96f)
                verticalLineToRelative(24f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -96f, 96f)
                horizontalLineTo(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.25f, -13f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                lineTo(54.67f, 216f)
            }
        }.build()

        return _BirdDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _BirdDuotone: ImageVector? = null
