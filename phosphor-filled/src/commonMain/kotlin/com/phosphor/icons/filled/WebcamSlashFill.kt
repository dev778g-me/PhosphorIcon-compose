package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.WebcamSlashFill: ImageVector
    get() {
        if (_WebcamSlashFill != null) {
            return _WebcamSlashFill!!
        }
        _WebcamSlashFill = ImageVector.Builder(
            name = "Filled.WebcamSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(83.34f, 43.19f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.78f, -6f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 190.39f, 154f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.11f, 0.22f)
                lineToRelative(-16.43f, -18.08f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.3f, -5f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -62.84f, -69.11f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.94f, -0.78f)
                close()
                moveTo(126.93f, 72f)
                arcToRelative(31.8f, 31.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.43f, 1.42f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 116.75f, 80f)
                lineToRelative(34.12f, 37.53f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.67f, -1.18f)
                arcTo(31.84f, 31.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 104f)
                arcTo(32.36f, 32.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 126.93f, 72f)
                close()
                moveTo(213.38f, 221.9f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.3f, -0.54f)
                lineTo(197.19f, 216f)
                lineTo(32f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8.53f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32.27f, 200f)
                lineTo(120f, 200f)
                lineTo(120f, 183.6f)
                arcTo(79.93f, 79.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 58.86f, 63.84f)
                lineTo(42.08f, 45.38f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 53.92f, 34.62f)
                lineToRelative(160f, 176f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 213.38f, 221.92f)
                close()
                moveTo(128f, 152f)
                arcToRelative(48.17f, 48.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, -1.06f)
                lineToRelative(-13.79f, -15.17f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 104.71f)
                lineTo(82.23f, 89.55f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 152f)
                close()
                moveTo(182.64f, 200f)
                lineTo(161.42f, 176.66f)
                arcTo(79.24f, 79.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 183.6f)
                lineTo(136f, 200f)
                close()
            }
        }.build()

        return _WebcamSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _WebcamSlashFill: ImageVector? = null
