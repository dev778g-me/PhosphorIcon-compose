package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.EarSlashFill: ImageVector
    get() {
        if (_EarSlashFill != null) {
            return _EarSlashFill!!
        }
        _EarSlashFill = ImageVector.Builder(
            name = "Filled.EarSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(213.92f, 210.62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.84f, 10.76f)
                lineTo(191.8f, 210.07f)
                arcToRelative(103.18f, 103.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.83f, -10.77f)
                close()
                moveTo(64.2f, 45.93f)
                lineTo(53.92f, 34.62f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 42.08f, 45.38f)
                lineTo(52.37f, 56.7f)
                arcTo(103.18f, 103.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64.2f, 45.93f)
                close()
                moveTo(203.63f, 199.3f)
                lineTo(64.2f, 45.93f)
                arcTo(103.94f, 103.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 203.63f, 199.3f)
                close()
                moveTo(159f, 104f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -20.08f, -22.09f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.45f, 15f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 11f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.74f, 6f)
                arcToRelative(7.68f, 7.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -0.26f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 159f, 104f)
                close()
                moveTo(192f, 112f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -85.89f, -60.16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.47f, 15f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                close()
                moveTo(148f, 168f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, -20f, -20f)
                arcToRelative(24.11f, 24.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -7f)
                lineToRelative(-20.45f, -22.5f)
                arcTo(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.68f, -6.56f)
                lineTo(84.39f, 91.92f)
                arcTo(47.59f, 47.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 112f)
                curveToRelative(0f, 11.9f, 6.71f, 20.5f, 13.82f, 29.6f)
                curveToRelative(7f, 8.92f, 14.18f, 18.15f, 14.18f, 30.4f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 34f, 14.29f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.19f, 11.42f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92f, 172f)
                curveToRelative(0f, -6.74f, -5f, -13.14f, -10.79f, -20.55f)
                curveTo(73.54f, 141.63f, 64f, 129.41f, 64f, 112f)
                arcToRelative(63.5f, 63.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, -32.66f)
                lineTo(52.37f, 56.7f)
                arcTo(103.94f, 103.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 191.8f, 210.07f)
                lineTo(153f, 167.37f)
                arcTo(19.82f, 19.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 148f, 168f)
                close()
            }
        }.build()

        return _EarSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _EarSlashFill: ImageVector? = null
