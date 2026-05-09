package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.WifiSlashDuotone: ImageVector
    get() {
        if (_WifiSlashDuotone != null) {
            return _WifiSlashDuotone!!
        }
        _WifiSlashDuotone = ImageVector.Builder(
            name = "Duotone.WifiSlashDuotone",
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
                moveTo(134.15f, 213.12f)
                lineToRelative(104f, -125.43f)
                arcToRelative(7.79f, 7.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.31f, -11.21f)
                arcToRelative(180.75f, 180.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -217.78f, 0f)
                arcTo(7.79f, 7.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.8f, 87.69f)
                lineTo(121.85f, 213.12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 134.15f, 213.12f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 40f)
                lineTo(208f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(188.77f, 147.28f)
                lineTo(238.2f, 87.69f)
                arcToRelative(7.79f, 7.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.31f, -11.21f)
                arcTo(179.58f, 179.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 40f)
                arcToRelative(182.63f, 182.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, -33.88f, 3.16f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(60f, 53.21f)
                arcToRelative(178.91f, 178.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40.9f, 23.27f)
                arcTo(7.79f, 7.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.8f, 87.69f)
                lineTo(121.85f, 213.12f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.3f, 0f)
                lineToRelative(34f, -41f)
            }
        }.build()

        return _WifiSlashDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _WifiSlashDuotone: ImageVector? = null
