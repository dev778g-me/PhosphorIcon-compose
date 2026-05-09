package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.WifiSlashFill: ImageVector
    get() {
        if (_WifiSlashFill != null) {
            return _WifiSlashFill!!
        }
        _WifiSlashFill = ImageVector.Builder(
            name = "Filled.WifiSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(213.92f, 210.62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.84f, 10.76f)
                lineToRelative(-33.67f, -37f)
                lineToRelative(-28.1f, 33.88f)
                arcTo(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 224f)
                horizontalLineToRelative(0f)
                arcToRelative(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.31f, -5.77f)
                lineTo(11.65f, 92.8f)
                arcTo(15.65f, 15.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.11f, 80.91f)
                arcTo(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.28f, 70.1f)
                arcTo(188.26f, 188.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 46.6f, 50.35f)
                lineToRelative(-4.29f, -4.72f)
                arcToRelative(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.13f, -11.38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.48f, 0.37f)
                close()
                moveTo(247.92f, 80.91f)
                arcToRelative(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.17f, -10.81f)
                arcTo(186.67f, 186.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 32f)
                arcToRelative(191f, 191f, 0f, isMoreThanHalf = false, isPositiveArc = false, -42.49f, 4.75f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 6.59f)
                lineTo(186f, 156.07f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, -0.14f)
                lineTo(244.35f, 92.8f)
                arcTo(15.65f, 15.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 247.89f, 80.91f)
                close()
            }
        }.build()

        return _WifiSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _WifiSlashFill: ImageVector? = null
