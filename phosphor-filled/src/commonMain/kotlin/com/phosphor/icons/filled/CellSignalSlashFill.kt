package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CellSignalSlashFill: ImageVector
    get() {
        if (_CellSignalSlashFill != null) {
            return _CellSignalSlashFill!!
        }
        _CellSignalSlashFill = ImageVector.Builder(
            name = "Filled.CellSignalSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(213.38f, 221.92f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.3f, -0.54f)
                lineToRelative(-5.51f, -6.06f)
                arcTo(16.11f, 16.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 216f)
                horizontalLineTo(32f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.06f, -10.59f)
                arcToRelative(16.4f, 16.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.07f, -17f)
                lineToRelative(79.13f, -79.12f)
                lineTo(42.26f, 45.62f)
                arcToRelative(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.14f, -11.38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.48f, 0.37f)
                lineToRelative(160f, 176f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 213.38f, 221.92f)
                close()
                moveTo(201f, 172.66f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, -2.69f)
                verticalLineTo(40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -27.32f, -11.32f)
                lineToRelative(-55.21f, 55.2f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.13f, 5.52f)
                close()
            }
        }.build()

        return _CellSignalSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _CellSignalSlashFill: ImageVector? = null
