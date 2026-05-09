package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BeerBottleFill: ImageVector
    get() {
        if (_BeerBottleFill != null) {
            return _BeerBottleFill!!
        }
        _BeerBottleFill = ImageVector.Builder(
            name = "Filled.BeerBottleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(245.66f, 42.34f)
                lineToRelative(-32f, -32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 11.32f)
                lineToRelative(1.48f, 1.47f)
                lineTo(148.65f, 64.51f)
                lineToRelative(-38.22f, 7.65f)
                arcToRelative(8.05f, 8.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.09f, 2.18f)
                lineTo(23f, 157.66f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 33.94f)
                lineTo(64.4f, 233f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 33.94f, 0f)
                lineToRelative(83.32f, -83.31f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.18f, -4.09f)
                lineToRelative(7.65f, -38.22f)
                lineToRelative(41.38f, -55.17f)
                lineToRelative(1.47f, 1.48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, -11.32f)
                close()
                moveTo(81.37f, 224f)
                arcToRelative(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.65f, -2.34f)
                lineTo(34.34f, 180.28f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -11.31f)
                lineTo(40f, 163.31f)
                lineTo(92.69f, 216f)
                lineTo(87f, 221.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 81.37f, 224f)
                close()
                moveTo(177.6f, 99.2f)
                arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.44f, 3.23f)
                lineToRelative(-7.53f, 37.63f)
                lineTo(160f, 148.69f)
                lineTo(107.31f, 96f)
                lineToRelative(8.63f, -8.63f)
                lineToRelative(37.63f, -7.53f)
                arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.23f, -1.44f)
                lineToRelative(58.45f, -43.84f)
                lineToRelative(6.19f, 6.19f)
                close()
            }
        }.build()

        return _BeerBottleFill!!
    }

@Suppress("ObjectPropertyName")
private var _BeerBottleFill: ImageVector? = null
